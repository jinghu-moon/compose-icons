package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Hash: ImageVector
    get() {
        if (_hash != null) return _hash!!
        _hash = phosphorDuotoneIcon(
            name = "Hash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 165.820 96.000 L 154.180 160.000 L 90.180 160.000 L 101.820 96.000 Z"),
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
        pathData = parseSvgPathData("M 224.000 88.000 L 175.400 88.000 L 183.870 41.430 C 184.578 37.122 181.701 33.042 177.406 32.262 C 173.111 31.481 168.983 34.288 168.130 38.570 L 159.130 88.000 L 111.400 88.000 L 119.870 41.430 C 120.578 37.122 117.701 33.042 113.406 32.262 C 109.111 31.481 104.983 34.288 104.130 38.570 L 95.140 88.000 L 48.000 88.000 C 43.582 88.000 40.000 91.582 40.000 96.000 C 40.000 100.418 43.582 104.000 48.000 104.000 L 92.230 104.000 L 83.500 152.000 L 32.000 152.000 C 27.582 152.000 24.000 155.582 24.000 160.000 C 24.000 164.418 27.582 168.000 32.000 168.000 L 80.600 168.000 L 72.130 214.570 C 71.341 218.916 74.224 223.080 78.570 223.870 C 79.042 223.957 79.520 224.001 80.000 224.000 C 83.862 223.995 87.170 221.230 87.860 217.430 L 96.860 168.000 L 144.600 168.000 L 136.130 214.570 C 135.341 218.916 138.224 223.080 142.570 223.870 C 143.042 223.957 143.520 224.001 144.000 224.000 C 147.863 223.995 151.170 221.230 151.860 217.430 L 160.860 168.000 L 208.000 168.000 C 212.418 168.000 216.000 164.418 216.000 160.000 C 216.000 155.582 212.418 152.000 208.000 152.000 L 163.770 152.000 L 172.500 104.000 L 224.000 104.000 C 228.418 104.000 232.000 100.418 232.000 96.000 C 232.000 91.582 228.418 88.000 224.000 88.000 ZM 147.500 152.000 L 99.770 152.000 L 108.500 104.000 L 156.230 104.000 Z"),
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
        return _hash!!
    }

private var _hash: ImageVector? = null
