package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.BugBeetle: ImageVector
    get() {
        if (_bugBeetle != null) return _bugBeetle!!
        _bugBeetle = phosphorBoldIcon(
            name = "BugBeetle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 224.000 160.000 C 230.627 160.000 236.000 154.627 236.000 148.000 C 236.000 141.373 230.627 136.000 224.000 136.000 L 212.000 136.000 L 212.000 120.000 L 224.000 120.000 C 230.627 120.000 236.000 114.627 236.000 108.000 C 236.000 101.373 230.627 96.000 224.000 96.000 L 210.450 96.000 C 207.668 81.684 201.195 68.344 191.670 57.300 L 208.490 40.490 C 213.184 35.796 213.184 28.184 208.490 23.490 C 203.796 18.796 196.184 18.796 191.490 23.490 L 173.490 41.490 C 145.783 23.517 110.097 23.517 82.390 41.490 L 64.390 23.490 C 59.696 18.796 52.084 18.796 47.390 23.490 C 42.696 28.184 42.696 35.796 47.390 40.490 L 64.330 57.300 C 54.805 68.344 48.332 81.684 45.550 96.000 L 32.000 96.000 C 25.373 96.000 20.000 101.373 20.000 108.000 C 20.000 114.627 25.373 120.000 32.000 120.000 L 44.000 120.000 L 44.000 136.000 L 32.000 136.000 C 25.373 136.000 20.000 141.373 20.000 148.000 C 20.000 154.627 25.373 160.000 32.000 160.000 L 44.000 160.000 C 44.001 165.371 44.520 170.729 45.550 176.000 L 32.000 176.000 C 25.373 176.000 20.000 181.373 20.000 188.000 C 20.000 194.627 25.373 200.000 32.000 200.000 L 54.150 200.000 C 68.836 227.095 97.181 243.973 128.000 243.973 C 158.819 243.973 187.164 227.095 201.850 200.000 L 224.000 200.000 C 230.627 200.000 236.000 194.627 236.000 188.000 C 236.000 181.373 230.627 176.000 224.000 176.000 L 210.450 176.000 C 211.480 170.729 211.999 165.371 212.000 160.000 ZM 128.000 52.000 C 154.961 52.037 178.598 70.025 185.820 96.000 L 70.180 96.000 C 77.402 70.025 101.039 52.037 128.000 52.000 ZM 140.000 218.790 L 140.000 148.000 C 140.000 141.373 134.627 136.000 128.000 136.000 C 121.373 136.000 116.000 141.373 116.000 148.000 L 116.000 218.790 C 88.083 213.056 68.034 188.500 68.000 160.000 L 68.000 120.000 L 188.000 120.000 L 188.000 160.000 C 187.966 188.500 167.917 213.056 140.000 218.790 Z"),
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
        return _bugBeetle!!
    }

private var _bugBeetle: ImageVector? = null
