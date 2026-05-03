package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.NewspaperClipping: ImageVector
    get() {
        if (_newspaperClipping != null) return _newspaperClipping!!
        _newspaperClipping = phosphorDuotoneIcon(
            name = "NewspaperClipping",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 216.000 48.000 L 40.000 48.000 C 35.582 48.000 32.000 51.582 32.000 56.000 L 32.000 216.000 L 64.000 200.000 L 96.000 216.000 L 128.000 200.000 L 160.000 216.000 L 192.000 200.000 L 224.000 216.000 L 224.000 56.000 C 224.000 51.582 220.418 48.000 216.000 48.000 ZM 112.000 160.000 L 64.000 160.000 L 64.000 96.000 L 112.000 96.000 Z"),
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
        pathData = parseSvgPathData("M 216.000 40.000 L 40.000 40.000 C 31.163 40.000 24.000 47.163 24.000 56.000 L 24.000 216.000 C 24.001 218.772 25.438 221.346 27.797 222.803 C 30.156 224.259 33.101 224.391 35.580 223.150 L 64.000 208.940 L 92.420 223.150 C 94.673 224.278 97.327 224.278 99.580 223.150 L 128.000 208.940 L 156.420 223.150 C 158.673 224.278 161.327 224.278 163.580 223.150 L 192.000 208.940 L 220.420 223.150 C 222.899 224.391 225.844 224.259 228.203 222.803 C 230.562 221.346 231.999 218.772 232.000 216.000 L 232.000 56.000 C 232.000 47.163 224.837 40.000 216.000 40.000 ZM 216.000 203.060 L 195.580 192.840 C 193.327 191.712 190.673 191.712 188.420 192.840 L 160.000 207.060 L 131.580 192.840 C 129.327 191.712 126.673 191.712 124.420 192.840 L 96.000 207.060 L 67.580 192.840 C 65.327 191.712 62.673 191.712 60.420 192.840 L 40.000 203.060 L 40.000 56.000 L 216.000 56.000 ZM 136.000 112.000 C 136.000 107.582 139.582 104.000 144.000 104.000 L 192.000 104.000 C 196.418 104.000 200.000 107.582 200.000 112.000 C 200.000 116.418 196.418 120.000 192.000 120.000 L 144.000 120.000 C 139.582 120.000 136.000 116.418 136.000 112.000 ZM 136.000 144.000 C 136.000 139.582 139.582 136.000 144.000 136.000 L 192.000 136.000 C 196.418 136.000 200.000 139.582 200.000 144.000 C 200.000 148.418 196.418 152.000 192.000 152.000 L 144.000 152.000 C 139.582 152.000 136.000 148.418 136.000 144.000 ZM 64.000 168.000 L 112.000 168.000 C 116.418 168.000 120.000 164.418 120.000 160.000 L 120.000 96.000 C 120.000 91.582 116.418 88.000 112.000 88.000 L 64.000 88.000 C 59.582 88.000 56.000 91.582 56.000 96.000 L 56.000 160.000 C 56.000 164.418 59.582 168.000 64.000 168.000 ZM 72.000 104.000 L 104.000 104.000 L 104.000 152.000 L 72.000 152.000 Z"),
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
        return _newspaperClipping!!
    }

private var _newspaperClipping: ImageVector? = null
