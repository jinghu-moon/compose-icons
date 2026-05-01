package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PhoneSlash: ImageVector
    get() {
        if (_phoneSlash != null) return _phoneSlash!!
        _phoneSlash = phosphorThinIcon(
            name = "PhoneSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(51.0f, 37.31f),
                    PathNode.CurveTo(49.514355f, 35.653145f, 46.966854f, 35.514355f, 45.31f, 37.0f),
                    PathNode.CurveTo(43.653145f, 38.485645f, 43.514355f, 41.033146f, 45.0f, 42.69f),
                    PathNode.LineTo(76.52f, 77.32f),
                    PathNode.CurveTo(58.000675f, 84.21968f, 41.18323f, 95.024315f, 27.21f, 109.0f),
                    PathNode.CurveTo(8.69f, 127.53f, 6.9f, 154.83f, 22.85f, 175.4f),
                    PathNode.CurveTo(26.120531f, 179.57454f, 31.743404f, 181.10732f, 36.68f, 179.17f),
                    PathNode.LineTo(85.68f, 161.78f),
                    PathNode.LineTo(85.83f, 161.73f),
                    PathNode.CurveTo(89.59549f, 160.22354f, 92.34527f, 156.91702f, 93.14f, 152.94f),
                    PathNode.LineTo(99.04f, 123.43f),
                    PathNode.CurveTo(99.28233f, 122.05419f, 100.23854f, 120.91131f, 101.55f, 120.43f),
                    PathNode.CurveTo(105.27046f, 119.14905f, 109.08094f, 118.146286f, 112.95f, 117.43f),
                    PathNode.LineTo(205.02f, 218.69f),
                    PathNode.CurveTo(205.97595f, 219.76758f, 207.43747f, 220.24792f, 208.8463f, 219.94757f),
                    PathNode.CurveTo(210.25513f, 219.64722f, 211.39365f, 218.61255f, 211.82698f, 217.23878f),
                    PathNode.CurveTo(212.2603f, 215.865f, 211.92151f, 214.36435f, 210.94f, 213.31f),
                    PathNode.Close,
                    PathNode.MoveTo(99.0f, 112.91f),
                    PathNode.CurveTo(95.0207f, 114.34029f, 92.0879f, 117.75936f, 91.28f, 121.91f),
                    PathNode.LineTo(85.38f, 151.42f),
                    PathNode.CurveTo(85.1193f, 152.71965f, 84.231705f, 153.80574f, 83.01f, 154.32f),
                    PathNode.LineTo(34.01f, 171.7f),
                    PathNode.LineTo(33.86f, 171.76f),
                    PathNode.CurveTo(32.22456f, 172.41614f, 30.352388f, 171.92473f, 29.25f, 170.55f),
                    PathNode.CurveTo(15.83f, 153.26f, 17.35f, 130.3f, 32.94f, 114.71f),
                    PathNode.CurveTo(46.845795f, 100.775215f, 63.733463f, 90.17896f, 82.33f, 83.72f),
                    PathNode.LineTo(106.77f, 110.6f),
                    PathNode.QuadTo(102.8f, 111.58f, 98.94f, 112.91f),
                    PathNode.Close,
                    PathNode.MoveTo(233.15f, 175.4f),
                    PathNode.CurveTo(229.87947f, 179.57454f, 224.25659f, 181.10732f, 219.32f, 179.17f),
                    PathNode.LineTo(210.01f, 175.87f),
                    PathNode.CurveTo(207.92789f, 175.12993f, 206.83994f, 172.84212f, 207.58f, 170.76f),
                    PathNode.CurveTo(208.32007f, 168.67789f, 210.60786f, 167.58994f, 212.69f, 168.33f),
                    PathNode.LineTo(222.06f, 171.65f),
                    PathNode.LineTo(222.21f, 171.71f),
                    PathNode.CurveTo(223.84544f, 172.36613f, 225.7176f, 171.87474f, 226.82f, 170.5f),
                    PathNode.CurveTo(240.24f, 153.21f, 238.72f, 130.25f, 223.13f, 114.66f),
                    PathNode.CurveTo(196.66f, 88.2f, 159.34f, 74.18f, 120.72f, 76.19f),
                    PathNode.CurveTo(118.510864f, 76.303215f, 116.62822f, 74.60414f, 116.515f, 72.395f),
                    PathNode.CurveTo(116.40178f, 70.18586f, 118.10086f, 68.303215f, 120.31f, 68.19f),
                    PathNode.CurveTo(161.17f, 66.07f, 200.72f, 80.93f, 228.79f, 108.99f),
                    PathNode.CurveTo(247.31f, 127.53f, 249.1f, 154.83f, 233.15f, 175.4f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _phoneSlash!!
    }

private var _phoneSlash: ImageVector? = null
