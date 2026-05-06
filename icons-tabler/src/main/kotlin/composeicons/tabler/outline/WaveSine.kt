package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.WaveSine: ImageVector
    get() {
        if (_waveSine != null) return _waveSine!!
        _waveSine = tablerOutlineIcon(
            name = "WaveSine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M21 12h-2c-.894 0-1.662-.857-1.761-2C16.943 6.55 16.49 4 14.49 4c-2 0-2.5 3.582-2.5 8 0 4.418-.5 8-2.5 8-2 0-2.452-2.547-2.749-6C6.641 12.853 5.874 12 4.978 12h-2"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
        }
        return _waveSine!!
    }

private var _waveSine: ImageVector? = null
