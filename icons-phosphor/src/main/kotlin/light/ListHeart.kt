package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ListHeart: ImageVector
    get() {
        if (_listHeart != null) return _listHeart!!
        _listHeart = phosphorLightIcon(
            name = "ListHeart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(34.0f, 64.0f),
                    PathNode.CurveTo(34.0f, 60.68629f, 36.68629f, 58.0f, 40.0f, 58.0f),
                    PathNode.LineTo(216.0f, 58.0f),
                    PathNode.CurveTo(219.3137f, 58.0f, 222.0f, 60.68629f, 222.0f, 64.0f),
                    PathNode.CurveTo(222.0f, 67.313705f, 219.3137f, 70.0f, 216.0f, 70.0f),
                    PathNode.LineTo(40.0f, 70.0f),
                    PathNode.CurveTo(36.68629f, 70.0f, 34.0f, 67.313705f, 34.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(40.0f, 134.0f),
                    PathNode.LineTo(104.0f, 134.0f),
                    PathNode.CurveTo(107.313705f, 134.0f, 110.0f, 131.3137f, 110.0f, 128.0f),
                    PathNode.CurveTo(110.0f, 124.686295f, 107.313705f, 122.0f, 104.0f, 122.0f),
                    PathNode.LineTo(40.0f, 122.0f),
                    PathNode.CurveTo(36.68629f, 122.0f, 34.0f, 124.686295f, 34.0f, 128.0f),
                    PathNode.CurveTo(34.0f, 131.3137f, 36.68629f, 134.0f, 40.0f, 134.0f),
                    PathNode.Close,
                    PathNode.MoveTo(120.0f, 186.0f),
                    PathNode.LineTo(40.0f, 186.0f),
                    PathNode.CurveTo(36.68629f, 186.0f, 34.0f, 188.6863f, 34.0f, 192.0f),
                    PathNode.CurveTo(34.0f, 195.3137f, 36.68629f, 198.0f, 40.0f, 198.0f),
                    PathNode.LineTo(120.0f, 198.0f),
                    PathNode.CurveTo(123.313705f, 198.0f, 126.0f, 195.3137f, 126.0f, 192.0f),
                    PathNode.CurveTo(126.0f, 188.6863f, 123.313705f, 186.0f, 120.0f, 186.0f),
                    PathNode.Close,
                    PathNode.MoveTo(246.0f, 144.0f),
                    PathNode.CurveTo(246.0f, 179.3f, 196.78f, 204.32f, 194.68f, 205.37f),
                    PathNode.CurveTo(192.99263f, 206.2124f, 191.00737f, 206.2124f, 189.32f, 205.37f),
                    PathNode.CurveTo(187.22f, 204.32f, 138.0f, 179.3f, 138.0f, 144.0f),
                    PathNode.CurveTo(138.0f, 131.08708f, 146.26291f, 119.622925f, 158.51317f, 115.5395f),
                    PathNode.CurveTo(170.76343f, 111.45608f, 184.25226f, 115.66967f, 192.0f, 126.0f),
                    PathNode.CurveTo(199.74774f, 115.66967f, 213.23657f, 111.45608f, 225.48683f, 115.5395f),
                    PathNode.CurveTo(237.73709f, 119.622925f, 246.0f, 131.08708f, 246.0f, 144.0f),
                    PathNode.Close,
                    PathNode.MoveTo(234.0f, 144.0f),
                    PathNode.CurveTo(234.0f, 134.05887f, 225.94113f, 126.0f, 216.0f, 126.0f),
                    PathNode.CurveTo(206.05887f, 126.0f, 198.0f, 134.05887f, 198.0f, 144.0f),
                    PathNode.CurveTo(198.0f, 147.3137f, 195.3137f, 150.0f, 192.0f, 150.0f),
                    PathNode.CurveTo(188.6863f, 150.0f, 186.0f, 147.3137f, 186.0f, 144.0f),
                    PathNode.CurveTo(186.0f, 134.05887f, 177.94113f, 126.0f, 168.0f, 126.0f),
                    PathNode.CurveTo(158.05887f, 126.0f, 150.0f, 134.05887f, 150.0f, 144.0f),
                    PathNode.CurveTo(150.0f, 158.15f, 161.78f, 171.0f, 171.67f, 179.25f),
                    PathNode.CurveTo(178.01988f, 184.49033f, 184.82336f, 189.15538f, 192.0f, 193.19f),
                    PathNode.CurveTo(199.17894f, 189.15909f, 205.98274f, 184.49382f, 212.33f, 179.25f),
                    PathNode.CurveTo(222.22f, 171.0f, 234.0f, 158.15f, 234.0f, 144.0f),
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
        return _listHeart!!
    }

private var _listHeart: ImageVector? = null
