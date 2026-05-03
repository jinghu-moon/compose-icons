package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Headset: ImageVector
    get() {
        if (_headset != null) return _headset!!
        _headset = phosphorDuotoneIcon(
            name = "Headset",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 80.000 144.000 L 80.000 184.000 C 80.000 192.837 72.837 200.000 64.000 200.000 L 48.000 200.000 C 39.163 200.000 32.000 192.837 32.000 184.000 L 32.000 128.000 L 64.000 128.000 C 72.837 128.000 80.000 135.163 80.000 144.000 ZM 192.000 128.000 C 183.163 128.000 176.000 135.163 176.000 144.000 L 176.000 184.000 C 176.000 192.837 183.163 200.000 192.000 200.000 L 224.000 200.000 L 224.000 128.000 Z"),
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
        pathData = parseSvgPathData("M 201.890 54.660 C 172.177 24.773 127.372 15.754 88.409 31.818 C 49.447 47.881 24.016 85.856 24.000 128.000 L 24.000 184.000 C 24.000 197.255 34.745 208.000 48.000 208.000 L 64.000 208.000 C 77.255 208.000 88.000 197.255 88.000 184.000 L 88.000 144.000 C 88.000 130.745 77.255 120.000 64.000 120.000 L 40.360 120.000 C 43.510 85.946 66.078 56.790 98.255 45.206 C 130.432 33.621 166.406 41.699 190.540 65.930 C 204.989 80.453 213.876 99.591 215.650 120.000 L 192.000 120.000 C 178.745 120.000 168.000 130.745 168.000 144.000 L 168.000 184.000 C 168.000 197.255 178.745 208.000 192.000 208.000 L 216.000 208.000 C 216.000 221.255 205.255 232.000 192.000 232.000 L 136.000 232.000 C 131.582 232.000 128.000 235.582 128.000 240.000 C 128.000 244.418 131.582 248.000 136.000 248.000 L 192.000 248.000 C 214.091 248.000 232.000 230.091 232.000 208.000 L 232.000 128.000 C 232.105 100.524 221.271 74.136 201.890 54.660 ZM 64.000 136.000 C 68.418 136.000 72.000 139.582 72.000 144.000 L 72.000 184.000 C 72.000 188.418 68.418 192.000 64.000 192.000 L 48.000 192.000 C 43.582 192.000 40.000 188.418 40.000 184.000 L 40.000 136.000 ZM 192.000 192.000 C 187.582 192.000 184.000 188.418 184.000 184.000 L 184.000 144.000 C 184.000 139.582 187.582 136.000 192.000 136.000 L 216.000 136.000 L 216.000 192.000 Z"),
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
        return _headset!!
    }

private var _headset: ImageVector? = null
