package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CirclesThreePlus: ImageVector
    get() {
        if (_circlesThreePlus != null) return _circlesThreePlus!!
        _circlesThreePlus = phosphorFillIcon(
            name = "CirclesThreePlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 120.000 80.000 C 120.000 102.091 102.091 120.000 80.000 120.000 C 57.909 120.000 40.000 102.091 40.000 80.000 C 40.000 57.909 57.909 40.000 80.000 40.000 C 102.091 40.000 120.000 57.909 120.000 80.000 ZM 176.000 120.000 C 198.091 120.000 216.000 102.091 216.000 80.000 C 216.000 57.909 198.091 40.000 176.000 40.000 C 153.909 40.000 136.000 57.909 136.000 80.000 C 136.000 102.091 153.909 120.000 176.000 120.000 ZM 80.000 136.000 C 57.909 136.000 40.000 153.909 40.000 176.000 C 40.000 198.091 57.909 216.000 80.000 216.000 C 102.091 216.000 120.000 198.091 120.000 176.000 C 120.000 153.909 102.091 136.000 80.000 136.000 ZM 208.000 168.000 L 184.000 168.000 L 184.000 144.000 C 184.000 139.582 180.418 136.000 176.000 136.000 C 171.582 136.000 168.000 139.582 168.000 144.000 L 168.000 168.000 L 144.000 168.000 C 139.582 168.000 136.000 171.582 136.000 176.000 C 136.000 180.418 139.582 184.000 144.000 184.000 L 168.000 184.000 L 168.000 208.000 C 168.000 212.418 171.582 216.000 176.000 216.000 C 180.418 216.000 184.000 212.418 184.000 208.000 L 184.000 184.000 L 208.000 184.000 C 212.418 184.000 216.000 180.418 216.000 176.000 C 216.000 171.582 212.418 168.000 208.000 168.000 Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _circlesThreePlus!!
    }

private var _circlesThreePlus: ImageVector? = null
