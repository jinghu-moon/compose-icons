package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.HandTap: ImageVector
    get() {
        if (_handTap != null) return _handTap!!
        _handTap = phosphorLightIcon(
            name = "HandTap",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(58.0f, 76.0f),
                    PathNode.CurveTo(58.0f, 43.967484f, 83.96748f, 18.0f, 116.0f, 18.0f),
                    PathNode.CurveTo(148.03252f, 18.0f, 174.0f, 43.967484f, 174.0f, 76.0f),
                    PathNode.CurveTo(174.0f, 79.313705f, 171.3137f, 82.0f, 168.0f, 82.0f),
                    PathNode.CurveTo(164.6863f, 82.0f, 162.0f, 79.313705f, 162.0f, 76.0f),
                    PathNode.CurveTo(162.0f, 50.594906f, 141.4051f, 30.0f, 116.0f, 30.0f),
                    PathNode.CurveTo(90.5949f, 30.0f, 70.0f, 50.594906f, 70.0f, 76.0f),
                    PathNode.CurveTo(70.0f, 79.313705f, 67.313705f, 82.0f, 64.0f, 82.0f),
                    PathNode.CurveTo(60.68629f, 82.0f, 58.0f, 79.313705f, 58.0f, 76.0f),
                    PathNode.Close,
                    PathNode.MoveTo(196.0f, 122.0f),
                    PathNode.CurveTo(190.79575f, 121.99506f, 185.711f, 123.559875f, 181.41f, 126.49f),
                    PathNode.CurveTo(179.60417f, 118.17426f, 173.84332f, 111.26851f, 165.98618f, 108.00085f),
                    PathNode.CurveTo(158.12903f, 104.73318f, 149.17014f, 105.51722f, 142.0f, 110.1f),
                    PathNode.LineTo(142.0f, 76.0f),
                    PathNode.CurveTo(142.0f, 61.6406f, 130.3594f, 50.0f, 116.0f, 50.0f),
                    PathNode.CurveTo(101.640594f, 50.0f, 90.0f, 61.6406f, 90.0f, 76.0f),
                    PathNode.LineTo(90.0f, 163.0f),
                    PathNode.LineTo(82.47f, 150.9f),
                    PathNode.CurveTo(75.2544f, 138.47359f, 59.331406f, 134.2494f, 46.905f, 141.465f),
                    PathNode.CurveTo(34.478592f, 148.6806f, 30.2544f, 164.60358f, 37.47f, 177.03f),
                    PathNode.LineTo(66.79f, 227.03f),
                    PathNode.CurveTo(68.49873f, 229.79625f, 72.09993f, 230.69809f, 74.91072f, 229.06366f),
                    PathNode.CurveTo(77.72151f, 227.42923f, 78.71897f, 223.85333f, 77.16f, 221.0f),
                    PathNode.LineTo(47.87f, 171.0f),
                    PathNode.CurveTo(44.004005f, 164.30354f, 46.298546f, 155.741f, 52.995f, 151.87502f),
                    PathNode.CurveTo(59.691452f, 148.009f, 68.254005f, 150.30354f, 72.12f, 157.0f),
                    PathNode.CurveTo(72.14765f, 157.05983f, 72.181145f, 157.11678f, 72.22f, 157.17f),
                    PathNode.LineTo(90.9f, 187.17f),
                    PathNode.CurveTo(92.31314f, 189.45021f, 95.06818f, 190.5153f, 97.64765f, 189.77866f),
                    PathNode.CurveTo(100.22712f, 189.042f, 102.004166f, 186.6826f, 102.0f, 184.0f),
                    PathNode.LineTo(102.0f, 76.0f),
                    PathNode.CurveTo(102.0f, 68.26801f, 108.26801f, 62.0f, 116.0f, 62.0f),
                    PathNode.CurveTo(123.73199f, 62.0f, 130.0f, 68.26801f, 130.0f, 76.0f),
                    PathNode.LineTo(130.0f, 144.0f),
                    PathNode.CurveTo(130.0f, 147.3137f, 132.6863f, 150.0f, 136.0f, 150.0f),
                    PathNode.CurveTo(139.3137f, 150.0f, 142.0f, 147.3137f, 142.0f, 144.0f),
                    PathNode.LineTo(142.0f, 132.0f),
                    PathNode.CurveTo(142.0f, 124.26801f, 148.26802f, 118.0f, 156.0f, 118.0f),
                    PathNode.CurveTo(163.73198f, 118.0f, 170.0f, 124.26801f, 170.0f, 132.0f),
                    PathNode.LineTo(170.0f, 152.0f),
                    PathNode.CurveTo(170.0f, 155.3137f, 172.6863f, 158.0f, 176.0f, 158.0f),
                    PathNode.CurveTo(179.3137f, 158.0f, 182.0f, 155.3137f, 182.0f, 152.0f),
                    PathNode.LineTo(182.0f, 148.0f),
                    PathNode.CurveTo(182.0f, 140.26802f, 188.26802f, 134.0f, 196.0f, 134.0f),
                    PathNode.CurveTo(203.73198f, 134.0f, 210.0f, 140.26802f, 210.0f, 148.0f),
                    PathNode.LineTo(210.0f, 184.0f),
                    PathNode.CurveTo(210.0f, 206.13f, 202.7f, 221.18f, 202.63f, 221.32f),
                    PathNode.CurveTo(201.18254f, 224.27321f, 202.3823f, 227.84128f, 205.32f, 229.32f),
                    PathNode.CurveTo(206.14589f, 229.75829f, 207.06506f, 229.99152f, 208.0f, 230.0f),
                    PathNode.CurveTo(210.2782f, 230.00447f, 212.36241f, 228.71832f, 213.38f, 226.68f),
                    PathNode.CurveTo(213.73f, 225.98f, 222.01f, 209.13f, 222.01f, 184.0f),
                    PathNode.LineTo(222.01f, 148.0f),
                    PathNode.CurveTo(222.01f, 141.10265f, 219.26935f, 134.48792f, 214.39124f, 129.6117f),
                    PathNode.CurveTo(209.51314f, 124.73545f, 202.89735f, 121.997345f, 196.0f, 122.0f),
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
        return _handTap!!
    }

private var _handTap: ImageVector? = null
