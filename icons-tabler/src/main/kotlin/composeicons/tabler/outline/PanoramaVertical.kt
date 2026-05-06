package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PanoramaVertical: ImageVector
    get() {
        if (_panoramaVertical != null) return _panoramaVertical!!
        _panoramaVertical = tablerOutlineIcon(
            name = "PanoramaVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M18.463 4.338c-1.932 5.106-1.932 10.211 0 15.317 .112 .306 .069 .648-.117 .915-.186 .268-.491 .428-.817 .43h-11c-.692 0-1.208-.692-.962-1.34C7.499 14.553 7.499 9.446 5.567 4.339 5.321 3.691 5.81 3 6.502 3h11.028c.693 0 1.18 .691 .935 1.338h-.002"),
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
        return _panoramaVertical!!
    }

private var _panoramaVertical: ImageVector? = null
