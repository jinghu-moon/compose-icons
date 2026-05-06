package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CropPortrait: ImageVector
    get() {
        if (_cropPortrait != null) return _cropPortrait!!
        _cropPortrait = tablerOutlineIcon(
            name = "CropPortrait",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M6 6C6 4.895 6.895 4 8 4h8c1.105 0 2 .895 2 2v12c0 1.105-.895 2-2 2h-8C6.895 20 6 19.105 6 18v-12"),
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
        return _cropPortrait!!
    }

private var _cropPortrait: ImageVector? = null
