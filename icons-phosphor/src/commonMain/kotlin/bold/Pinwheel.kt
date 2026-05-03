package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Pinwheel: ImageVector
    get() {
        if (_pinwheel != null) return _pinwheel!!
        _pinwheel = phosphorBoldIcon(
            name = "Pinwheel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.49f, 215.52f),
                    PathNode.LineTo(188.49f, 171.52f),
                    PathNode.CurveTo(220.11044f, 158.387f, 235.79366f, 122.69326f, 224.08f, 90.52f),
                    PathNode.CurveTo(221.81244f, 84.29338f, 214.92699f, 81.08345f, 208.7f, 83.35f),
                    PathNode.LineTo(173.09f, 96.35f),
                    PathNode.CurveTo(180.87178f, 73.06716f, 174.65f, 47.3848f, 157.0754f, 30.244776f),
                    PathNode.CurveTo(139.50081f, 13.104753f, 113.670746f, 7.527818f, 90.59f, 15.89f),
                    PathNode.CurveTo(84.36338f, 18.157558f, 81.15345f, 25.043015f, 83.42f, 31.27f),
                    PathNode.LineTo(96.42f, 66.88f),
                    PathNode.CurveTo(73.121864f, 59.06971f, 47.409184f, 65.28814f, 30.254765f, 82.88159f),
                    PathNode.CurveTo(13.100348f, 100.475044f, 7.533555f, 126.33664f, 15.93f, 149.43f),
                    PathNode.CurveTo(18.197557f, 155.65663f, 25.083015f, 158.86655f, 31.31f, 156.6f),
                    PathNode.LineTo(66.92f, 143.6f),
                    PathNode.CurveTo(59.057266f, 166.90369f, 65.25766f, 192.65163f, 82.86685f, 209.82138f),
                    PathNode.CurveTo(100.47604f, 226.99113f, 126.37241f, 232.53902f, 149.47f, 224.09f),
                    PathNode.CurveTo(155.69662f, 221.82245f, 158.90656f, 214.93698f, 156.64f, 208.71f),
                    PathNode.LineTo(143.69f, 173.12f),
                    PathNode.CurveTo(148.76909f, 174.83138f, 154.04433f, 175.89314f, 159.39f, 176.28f),
                    PathNode.LineTo(215.56f, 232.45f),
                    PathNode.CurveTo(220.25443f, 237.14442f, 227.86559f, 237.14442f, 232.56f, 232.45f),
                    PathNode.CurveTo(237.25443f, 227.75558f, 237.25443f, 220.14442f, 232.56f, 215.45f),
                    PathNode.Close,
                    PathNode.MoveTo(129.38f, 39.78f),
                    PathNode.CurveTo(142.0534f, 45.689194f, 150.72098f, 57.787537f, 152.23982f, 71.68815f),
                    PathNode.CurveTo(153.75867f, 85.58876f, 147.90828f, 99.2734f, 136.81f, 107.78f),
                    PathNode.LineTo(110.7f, 36.05f),
                    PathNode.CurveTo(117.136765f, 35.76336f, 123.54693f, 37.04333f, 129.38f, 39.78f),
                    PathNode.Close,
                    PathNode.MoveTo(36.05f, 129.32f),
                    PathNode.CurveTo(35.247414f, 111.846306f, 45.891747f, 95.87784f, 62.32932f, 89.89617f),
                    PathNode.CurveTo(78.76689f, 83.9145f, 97.18461f, 89.30721f, 107.8f, 103.21f),
                    PathNode.Close,
                    PathNode.MoveTo(110.64f, 200.24f),
                    PathNode.CurveTo(97.96659f, 194.33081f, 89.29903f, 182.23247f, 87.780174f, 168.33186f),
                    PathNode.CurveTo(86.26133f, 154.43124f, 92.111725f, 140.7466f, 103.21f, 132.24f),
                    PathNode.LineTo(129.32f, 204.0f),
                    PathNode.CurveTo(122.88083f, 204.27647f, 116.47074f, 202.98622f, 110.64f, 200.24f),
                    PathNode.Close,
                    PathNode.MoveTo(147.09f, 148.73f),
                    PathNode.CurveTo(141.24242f, 146.01749f, 136.13991f, 141.92726f, 132.22f, 136.81f),
                    PathNode.LineTo(204.0f, 110.7f),
                    PathNode.CurveTo(204.61322f, 124.67022f, 197.88643f, 137.94644f, 186.25887f, 145.71451f),
                    PathNode.CurveTo(174.6313f, 153.48257f, 159.79126f, 154.61456f, 147.12f, 148.7f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _pinwheel!!
    }

private var _pinwheel: ImageVector? = null
