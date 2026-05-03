package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.HandSoap: ImageVector
    get() {
        if (_handSoap != null) return _handSoap!!
        _handSoap = phosphorLightIcon(
            name = "HandSoap",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 182.000 98.480 L 182.000 88.000 C 182.000 71.431 168.569 58.000 152.000 58.000 L 134.000 58.000 L 134.000 30.000 L 168.000 30.000 C 173.523 30.000 178.000 34.477 178.000 40.000 C 178.000 43.314 180.686 46.000 184.000 46.000 C 187.314 46.000 190.000 43.314 190.000 40.000 C 190.000 27.850 180.150 18.000 168.000 18.000 L 104.000 18.000 C 100.686 18.000 98.000 20.686 98.000 24.000 C 98.000 27.314 100.686 30.000 104.000 30.000 L 122.000 30.000 L 122.000 58.000 L 104.000 58.000 C 87.431 58.000 74.000 71.431 74.000 88.000 L 74.000 98.480 C 55.576 101.447 42.023 117.338 42.000 136.000 L 42.000 216.000 C 42.000 223.732 48.268 230.000 56.000 230.000 L 200.000 230.000 C 207.732 230.000 214.000 223.732 214.000 216.000 L 214.000 136.000 C 213.977 117.338 200.424 101.447 182.000 98.480 ZM 104.000 70.000 L 152.000 70.000 C 161.941 70.000 170.000 78.059 170.000 88.000 L 170.000 98.000 L 86.000 98.000 L 86.000 88.000 C 86.000 78.059 94.059 70.000 104.000 70.000 ZM 202.000 216.000 C 202.000 217.105 201.105 218.000 200.000 218.000 L 56.000 218.000 C 54.895 218.000 54.000 217.105 54.000 216.000 L 54.000 136.000 C 54.000 121.641 65.641 110.000 80.000 110.000 L 176.000 110.000 C 190.359 110.000 202.000 121.641 202.000 136.000 Z"),
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
        return _handSoap!!
    }

private var _handSoap: ImageVector? = null
