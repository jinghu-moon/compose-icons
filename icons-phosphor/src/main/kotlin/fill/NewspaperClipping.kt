package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.NewspaperClipping: ImageVector
    get() {
        if (_newspaperClipping != null) return _newspaperClipping!!
        _newspaperClipping = phosphorFillIcon(
            name = "NewspaperClipping",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 216.000 40.000 L 40.000 40.000 C 31.163 40.000 24.000 47.163 24.000 56.000 L 24.000 216.000 C 24.001 218.772 25.438 221.346 27.797 222.803 C 30.156 224.259 33.101 224.391 35.580 223.150 L 64.000 208.940 L 92.420 223.150 C 94.673 224.278 97.327 224.278 99.580 223.150 L 128.000 208.940 L 156.420 223.150 C 158.673 224.278 161.327 224.278 163.580 223.150 L 192.000 208.940 L 220.420 223.150 C 222.899 224.391 225.844 224.259 228.203 222.803 C 230.562 221.346 231.999 218.772 232.000 216.000 L 232.000 56.000 C 232.000 47.163 224.837 40.000 216.000 40.000 ZM 116.000 160.000 C 116.000 162.209 114.209 164.000 112.000 164.000 L 64.000 164.000 C 61.791 164.000 60.000 162.209 60.000 160.000 L 60.000 96.000 C 60.000 93.791 61.791 92.000 64.000 92.000 L 112.000 92.000 C 114.209 92.000 116.000 93.791 116.000 96.000 ZM 192.000 152.000 L 144.000 152.000 C 139.582 152.000 136.000 148.418 136.000 144.000 C 136.000 139.582 139.582 136.000 144.000 136.000 L 192.000 136.000 C 196.418 136.000 200.000 139.582 200.000 144.000 C 200.000 148.418 196.418 152.000 192.000 152.000 ZM 192.000 120.000 L 144.000 120.000 C 139.582 120.000 136.000 116.418 136.000 112.000 C 136.000 107.582 139.582 104.000 144.000 104.000 L 192.000 104.000 C 196.418 104.000 200.000 107.582 200.000 112.000 C 200.000 116.418 196.418 120.000 192.000 120.000 Z"),
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
