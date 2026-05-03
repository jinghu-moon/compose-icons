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
                pathData = parseSvgPathData("M 21.000 12.000 L 19.000 12.000 C 18.106 12.000 17.338 11.143 17.239 10.000 C 16.943 6.550 16.490 4.000 14.490 4.000 C 12.490 4.000 11.990 7.582 11.990 12.000 C 11.990 16.418 11.490 20.000 9.490 20.000 C 7.490 20.000 7.038 17.453 6.741 14.000 C 6.641 12.853 5.874 12.000 4.978 12.000 L 2.978 12.000"),
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
