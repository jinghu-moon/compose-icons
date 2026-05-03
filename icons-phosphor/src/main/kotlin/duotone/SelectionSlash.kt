package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.SelectionSlash: ImageVector
    get() {
        if (_selectionSlash != null) return _selectionSlash!!
        _selectionSlash = phosphorDuotoneIcon(
            name = "SelectionSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 216.000 40.000 L 216.000 216.000 L 40.000 216.000 L 40.000 40.000 Z"),
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
        pathData = parseSvgPathData("M 104.000 40.000 C 104.000 35.582 107.582 32.000 112.000 32.000 L 144.000 32.000 C 148.418 32.000 152.000 35.582 152.000 40.000 C 152.000 44.418 148.418 48.000 144.000 48.000 L 112.000 48.000 C 107.582 48.000 104.000 44.418 104.000 40.000 ZM 144.000 208.000 L 112.000 208.000 C 107.582 208.000 104.000 211.582 104.000 216.000 C 104.000 220.418 107.582 224.000 112.000 224.000 L 144.000 224.000 C 148.418 224.000 152.000 220.418 152.000 216.000 C 152.000 211.582 148.418 208.000 144.000 208.000 ZM 208.000 32.000 L 184.000 32.000 C 179.582 32.000 176.000 35.582 176.000 40.000 C 176.000 44.418 179.582 48.000 184.000 48.000 L 208.000 48.000 L 208.000 72.000 C 208.000 76.418 211.582 80.000 216.000 80.000 C 220.418 80.000 224.000 76.418 224.000 72.000 L 224.000 48.000 C 224.000 39.163 216.837 32.000 208.000 32.000 ZM 216.000 104.000 C 211.582 104.000 208.000 107.582 208.000 112.000 L 208.000 144.000 C 208.000 148.418 211.582 152.000 216.000 152.000 C 220.418 152.000 224.000 148.418 224.000 144.000 L 224.000 112.000 C 224.000 107.582 220.418 104.000 216.000 104.000 ZM 40.000 152.000 C 44.418 152.000 48.000 148.418 48.000 144.000 L 48.000 112.000 C 48.000 107.582 44.418 104.000 40.000 104.000 C 35.582 104.000 32.000 107.582 32.000 112.000 L 32.000 144.000 C 32.000 148.418 35.582 152.000 40.000 152.000 ZM 72.000 208.000 L 48.000 208.000 L 48.000 184.000 C 48.000 179.582 44.418 176.000 40.000 176.000 C 35.582 176.000 32.000 179.582 32.000 184.000 L 32.000 208.000 C 32.000 216.837 39.163 224.000 48.000 224.000 L 72.000 224.000 C 76.418 224.000 80.000 220.418 80.000 216.000 C 80.000 211.582 76.418 208.000 72.000 208.000 ZM 53.920 34.620 C 52.008 32.465 49.085 31.504 46.267 32.105 C 43.450 32.706 41.173 34.775 40.306 37.522 C 39.439 40.270 40.117 43.271 42.080 45.380 L 202.080 221.380 C 203.992 223.535 206.915 224.496 209.733 223.895 C 212.550 223.294 214.827 221.225 215.694 218.478 C 216.561 215.730 215.883 212.729 213.920 210.620 Z"),
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
        return _selectionSlash!!
    }

private var _selectionSlash: ImageVector? = null
