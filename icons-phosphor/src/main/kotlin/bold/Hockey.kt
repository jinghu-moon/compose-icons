package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Hockey: ImageVector
    get() {
        if (_hockey != null) return _hockey!!
        _hockey = phosphorBoldIcon(
            name = "Hockey",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 148.0f),
                    PathNode.LineTo(132.75f, 148.0f),
                    PathNode.LineTo(41.14f, 40.23f),
                    PathNode.CurveTo(36.80106f, 35.373863f, 29.380848f, 34.864677f, 24.41923f, 39.082596f),
                    PathNode.CurveTo(19.457611f, 43.30051f, 18.765669f, 50.705917f, 22.86f, 55.77f),
                    PathNode.LineTo(118.02f, 167.77f),
                    PathNode.LineTo(118.08f, 167.84f),
                    PathNode.LineTo(156.46f, 213.0f),
                    PathNode.CurveTo(160.26913f, 217.45338f, 165.8398f, 220.0121f, 171.7f, 220.0f),
                    PathNode.LineTo(224.0f, 220.0f),
                    PathNode.CurveTo(235.0457f, 220.0f, 244.0f, 211.0457f, 244.0f, 200.0f),
                    PathNode.LineTo(244.0f, 168.0f),
                    PathNode.CurveTo(244.0f, 156.9543f, 235.0457f, 148.0f, 224.0f, 148.0f),
                    PathNode.Close,
                    PathNode.MoveTo(153.15f, 172.0f),
                    PathNode.LineTo(180.0f, 172.0f),
                    PathNode.LineTo(180.0f, 196.0f),
                    PathNode.LineTo(173.55f, 196.0f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 196.0f),
                    PathNode.LineTo(204.0f, 196.0f),
                    PathNode.LineTo(204.0f, 172.0f),
                    PathNode.LineTo(220.0f, 172.0f),
                    PathNode.Close,
                    PathNode.MoveTo(153.66f, 112.23f),
                    PathNode.LineTo(214.86f, 40.23f),
                    PathNode.CurveTo(219.19894f, 35.373863f, 226.61916f, 34.864677f, 231.58076f, 39.082596f),
                    PathNode.CurveTo(236.54239f, 43.30051f, 237.23433f, 50.705917f, 233.14f, 55.77f),
                    PathNode.LineTo(171.94f, 127.77f),
                    PathNode.CurveTo(169.20021f, 131.1587f, 164.83868f, 132.7958f, 160.5458f, 132.04678f),
                    PathNode.CurveTo(156.25293f, 131.29776f, 152.70352f, 128.28036f, 151.27321f, 124.164055f),
                    PathNode.CurveTo(149.8429f, 120.047745f, 150.75653f, 115.47956f, 153.66f, 112.23f),
                    PathNode.Close,
                    PathNode.MoveTo(109.52f, 182.68f),
                    PathNode.CurveTo(104.47145f, 178.39082f, 96.902245f, 179.00406f, 92.61f, 184.05f),
                    PathNode.LineTo(82.45f, 196.0f),
                    PathNode.LineTo(76.0f, 196.0f),
                    PathNode.LineTo(76.0f, 171.93f),
                    PathNode.CurveTo(82.339516f, 171.24225f, 87.034f, 165.71638f, 86.68809f, 159.34906f),
                    PathNode.CurveTo(86.342186f, 152.98174f, 81.07671f, 147.99695f, 74.7f, 148.0f),
                    PathNode.LineTo(32.0f, 148.0f),
                    PathNode.CurveTo(20.954306f, 148.0f, 12.0f, 156.9543f, 12.0f, 168.0f),
                    PathNode.LineTo(12.0f, 200.0f),
                    PathNode.CurveTo(12.0f, 211.0457f, 20.954306f, 220.0f, 32.0f, 220.0f),
                    PathNode.LineTo(84.3f, 220.0f),
                    PathNode.CurveTo(90.16021f, 220.0121f, 95.73087f, 217.45338f, 99.54f, 213.0f),
                    PathNode.LineTo(110.89f, 199.64f),
                    PathNode.CurveTo(112.96545f, 197.21278f, 113.98777f, 194.0584f, 113.73064f, 190.8752f),
                    PathNode.CurveTo(113.4735f, 187.69202f, 111.95812f, 184.74261f, 109.52f, 182.68f),
                    PathNode.Close,
                    PathNode.MoveTo(36.0f, 172.0f),
                    PathNode.LineTo(52.0f, 172.0f),
                    PathNode.LineTo(52.0f, 196.0f),
                    PathNode.LineTo(36.0f, 196.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _hockey!!
    }

private var _hockey: ImageVector? = null
