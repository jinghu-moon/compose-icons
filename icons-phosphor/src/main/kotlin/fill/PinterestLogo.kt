package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PinterestLogo: ImageVector
    get() {
        if (_pinterestLogo != null) return _pinterestLogo!!
        _pinterestLogo = phosphorFillIcon(
            name = "PinterestLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(240.0f, 128.7f),
                    PathNode.CurveTo(239.62f, 185.19f, 193.54f, 231.43f, 137.06f, 231.99f),
                    PathNode.CurveTo(128.32172f, 232.0821f, 119.60658f, 231.07419f, 111.12f, 228.99f),
                    PathNode.CurveTo(110.088844f, 228.7327f, 109.20247f, 228.07565f, 108.65651f, 227.16385f),
                    PathNode.CurveTo(108.11055f, 226.25204f, 107.94989f, 225.16045f, 108.21f, 224.13f),
                    PathNode.LineTo(116.85f, 189.58f),
                    PathNode.CurveTo(125.277145f, 193.80347f, 134.57373f, 196.00177f, 144.0f, 196.0f),
                    PathNode.CurveTo(181.0f, 196.0f, 210.7f, 162.55f, 207.81f, 122.64f),
                    PathNode.CurveTo(205.66841f, 94.33999f, 187.10179f, 69.93831f, 160.3978f, 60.327217f),
                    PathNode.CurveTo(133.69379f, 50.71613f, 103.8351f, 57.688972f, 84.14987f, 78.133255f),
                    PathNode.CurveTo(64.46464f, 98.57754f, 58.625935f, 128.67854f, 69.24f, 155.0f),
                    PathNode.CurveTo(70.05563f, 157.03111f, 71.66786f, 158.63937f, 73.70101f, 159.44998f),
                    PathNode.CurveTo(75.734146f, 160.2606f, 78.01063f, 160.20277f, 80.0f, 159.29f),
                    PathNode.CurveTo(83.89717f, 157.40094f, 85.649956f, 152.80428f, 84.0f, 148.8f),
                    PathNode.CurveTo(75.83165f, 128.316f, 80.44571f, 104.94524f, 95.785995f, 89.10251f),
                    PathNode.CurveTo(111.12628f, 73.25979f, 134.33627f, 67.895195f, 155.07278f, 75.39938f),
                    PathNode.CurveTo(175.80931f, 82.903564f, 190.21101f, 101.87916f, 191.86f, 123.87f),
                    PathNode.CurveTo(194.0f, 154.4f, 171.73f, 180.0f, 144.0f, 180.0f),
                    PathNode.CurveTo(135.84474f, 179.99611f, 127.844765f, 177.76965f, 120.86f, 173.56f),
                    PathNode.LineTo(135.76f, 113.94f),
                    PathNode.CurveTo(136.7459f, 109.68798f, 134.14153f, 105.430504f, 129.90703f, 104.37188f),
                    PathNode.CurveTo(125.67253f, 103.313255f, 121.37105f, 105.84426f, 120.24f, 110.06f),
                    PathNode.LineTo(93.38f, 217.51f),
                    PathNode.CurveTo(93.08453f, 218.69534f, 92.2636f, 219.68068f, 91.15109f, 220.1853f),
                    PathNode.CurveTo(90.03858f, 220.68993f, 88.75646f, 220.65851f, 87.67f, 220.1f),
                    PathNode.CurveTo(53.07821f, 201.94833f, 31.576023f, 165.9427f, 32.0f, 126.88f),
                    PathNode.CurveTo(32.6f, 70.52f, 78.67f, 24.52f, 135.0f, 24.0f),
                    PathNode.CurveTo(162.87714f, 23.731298f, 189.695f, 34.666126f, 209.43622f, 54.350933f),
                    PathNode.CurveTo(229.17743f, 74.03574f, 240.18893f, 100.822205f, 240.0f, 128.7f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _pinterestLogo!!
    }

private var _pinterestLogo: ImageVector? = null
