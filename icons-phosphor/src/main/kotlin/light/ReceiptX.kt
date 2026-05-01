package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ReceiptX: ImageVector
    get() {
        if (_receiptX != null) return _receiptX!!
        _receiptX = phosphorLightIcon(
            name = "ReceiptX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 42.0f),
                    PathNode.LineTo(40.0f, 42.0f),
                    PathNode.CurveTo(32.268013f, 42.0f, 26.0f, 48.268013f, 26.0f, 56.0f),
                    PathNode.LineTo(26.0f, 208.0f),
                    PathNode.CurveTo(25.999376f, 210.07913f, 27.07517f, 212.01039f, 28.843288f, 213.10426f),
                    PathNode.CurveTo(30.611406f, 214.19814f, 32.819798f, 214.29868f, 34.68f, 213.37f),
                    PathNode.LineTo(64.0f, 198.71f),
                    PathNode.LineTo(93.32f, 213.37f),
                    PathNode.CurveTo(95.00737f, 214.2124f, 96.99263f, 214.2124f, 98.68f, 213.37f),
                    PathNode.LineTo(128.0f, 198.71f),
                    PathNode.LineTo(157.32f, 213.37f),
                    PathNode.CurveTo(159.00737f, 214.2124f, 160.99263f, 214.2124f, 162.68f, 213.37f),
                    PathNode.LineTo(192.0f, 198.71f),
                    PathNode.LineTo(221.32f, 213.37f),
                    PathNode.CurveTo(222.15244f, 213.78488f, 223.06992f, 214.00056f, 224.0f, 214.0f),
                    PathNode.CurveTo(225.11368f, 214.00174f, 226.20534f, 213.68983f, 227.15f, 213.1f),
                    PathNode.CurveTo(228.9194f, 212.00856f, 229.99771f, 210.07895f, 230.0f, 208.0f),
                    PathNode.LineTo(230.0f, 56.0f),
                    PathNode.CurveTo(230.0f, 48.268013f, 223.73198f, 42.0f, 216.0f, 42.0f),
                    PathNode.Close,
                    PathNode.MoveTo(218.0f, 198.29f),
                    PathNode.LineTo(194.68f, 186.63f),
                    PathNode.CurveTo(192.99263f, 185.7876f, 191.00737f, 185.7876f, 189.32f, 186.63f),
                    PathNode.LineTo(160.0f, 201.29f),
                    PathNode.LineTo(130.68f, 186.63f),
                    PathNode.CurveTo(128.99263f, 185.7876f, 127.00737f, 185.7876f, 125.32f, 186.63f),
                    PathNode.LineTo(96.0f, 201.29f),
                    PathNode.LineTo(66.68f, 186.63f),
                    PathNode.CurveTo(64.99263f, 185.7876f, 63.007366f, 185.7876f, 61.32f, 186.63f),
                    PathNode.LineTo(38.0f, 198.29f),
                    PathNode.LineTo(38.0f, 56.0f),
                    PathNode.CurveTo(38.0f, 54.89543f, 38.89543f, 54.0f, 40.0f, 54.0f),
                    PathNode.LineTo(216.0f, 54.0f),
                    PathNode.CurveTo(217.10457f, 54.0f, 218.0f, 54.89543f, 218.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(156.24f, 100.29f),
                    PathNode.LineTo(136.48f, 120.0f),
                    PathNode.LineTo(156.24f, 139.76f),
                    PathNode.CurveTo(157.84523f, 141.25575f, 158.506f, 143.50844f, 157.96309f, 145.63431f),
                    PathNode.CurveTo(157.42018f, 147.76018f, 155.76018f, 149.42018f, 153.63431f, 149.96309f),
                    PathNode.CurveTo(151.50844f, 150.506f, 149.25575f, 149.84523f, 147.76f, 148.24f),
                    PathNode.LineTo(128.0f, 128.48f),
                    PathNode.LineTo(108.24f, 148.24f),
                    PathNode.CurveTo(105.87592f, 150.44287f, 102.191925f, 150.37787f, 99.90703f, 148.09297f),
                    PathNode.CurveTo(97.62213f, 145.80807f, 97.55713f, 142.12408f, 99.76f, 139.76f),
                    PathNode.LineTo(119.52f, 120.0f),
                    PathNode.LineTo(99.76f, 100.24f),
                    PathNode.CurveTo(97.55713f, 97.87592f, 97.62213f, 94.191925f, 99.90703f, 91.90703f),
                    PathNode.CurveTo(102.191925f, 89.62213f, 105.87592f, 89.55713f, 108.24f, 91.76f),
                    PathNode.LineTo(128.0f, 111.52f),
                    PathNode.LineTo(147.76f, 91.76f),
                    PathNode.CurveTo(150.12408f, 89.55713f, 153.80807f, 89.62213f, 156.09297f, 91.90703f),
                    PathNode.CurveTo(158.37787f, 94.191925f, 158.44287f, 97.87592f, 156.24f, 100.24f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _receiptX!!
    }

private var _receiptX: ImageVector? = null
