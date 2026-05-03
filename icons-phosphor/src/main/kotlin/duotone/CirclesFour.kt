package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.CirclesFour: ImageVector
    get() {
        if (_circlesFour != null) return _circlesFour!!
        _circlesFour = phosphorDuotoneIcon(
            name = "CirclesFour",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 112.000 80.000 C 112.000 97.673 97.673 112.000 80.000 112.000 C 62.327 112.000 48.000 97.673 48.000 80.000 C 48.000 62.327 62.327 48.000 80.000 48.000 C 97.673 48.000 112.000 62.327 112.000 80.000 ZM 176.000 112.000 C 193.673 112.000 208.000 97.673 208.000 80.000 C 208.000 62.327 193.673 48.000 176.000 48.000 C 158.327 48.000 144.000 62.327 144.000 80.000 C 144.000 97.673 158.327 112.000 176.000 112.000 ZM 80.000 144.000 C 62.327 144.000 48.000 158.327 48.000 176.000 C 48.000 193.673 62.327 208.000 80.000 208.000 C 97.673 208.000 112.000 193.673 112.000 176.000 C 112.000 158.327 97.673 144.000 80.000 144.000 ZM 176.000 144.000 C 158.327 144.000 144.000 158.327 144.000 176.000 C 144.000 193.673 158.327 208.000 176.000 208.000 C 193.673 208.000 208.000 193.673 208.000 176.000 C 208.000 158.327 193.673 144.000 176.000 144.000 Z"),
            pathFillType = PathFillType.NonZero,
            fill = SolidColor(Color(0xFF000000)),
            fillAlpha = 1.0f,
            stroke = null,
            strokeAlpha = 1.0f,
            strokeLineWidth = 0.0f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
        )
    }
    addPath(
        pathData = parseSvgPathData("M 80.000 40.000 C 57.909 40.000 40.000 57.909 40.000 80.000 C 40.000 102.091 57.909 120.000 80.000 120.000 C 102.091 120.000 120.000 102.091 120.000 80.000 C 120.000 57.909 102.091 40.000 80.000 40.000 ZM 80.000 104.000 C 66.745 104.000 56.000 93.255 56.000 80.000 C 56.000 66.745 66.745 56.000 80.000 56.000 C 93.255 56.000 104.000 66.745 104.000 80.000 C 104.000 93.255 93.255 104.000 80.000 104.000 ZM 176.000 120.000 C 198.091 120.000 216.000 102.091 216.000 80.000 C 216.000 57.909 198.091 40.000 176.000 40.000 C 153.909 40.000 136.000 57.909 136.000 80.000 C 136.000 102.091 153.909 120.000 176.000 120.000 ZM 176.000 56.000 C 189.255 56.000 200.000 66.745 200.000 80.000 C 200.000 93.255 189.255 104.000 176.000 104.000 C 162.745 104.000 152.000 93.255 152.000 80.000 C 152.000 66.745 162.745 56.000 176.000 56.000 ZM 80.000 136.000 C 57.909 136.000 40.000 153.909 40.000 176.000 C 40.000 198.091 57.909 216.000 80.000 216.000 C 102.091 216.000 120.000 198.091 120.000 176.000 C 120.000 153.909 102.091 136.000 80.000 136.000 ZM 80.000 200.000 C 66.745 200.000 56.000 189.255 56.000 176.000 C 56.000 162.745 66.745 152.000 80.000 152.000 C 93.255 152.000 104.000 162.745 104.000 176.000 C 104.000 189.255 93.255 200.000 80.000 200.000 ZM 176.000 136.000 C 153.909 136.000 136.000 153.909 136.000 176.000 C 136.000 198.091 153.909 216.000 176.000 216.000 C 198.091 216.000 216.000 198.091 216.000 176.000 C 216.000 153.909 198.091 136.000 176.000 136.000 ZM 176.000 200.000 C 162.745 200.000 152.000 189.255 152.000 176.000 C 152.000 162.745 162.745 152.000 176.000 152.000 C 189.255 152.000 200.000 162.745 200.000 176.000 C 200.000 189.255 189.255 200.000 176.000 200.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _circlesFour!!
    }

private var _circlesFour: ImageVector? = null
