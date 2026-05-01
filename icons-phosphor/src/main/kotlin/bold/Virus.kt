package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Virus: ImageVector
    get() {
        if (_virus != null) return _virus!!
        _virus = phosphorBoldIcon(
            name = "Virus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(108.0f, 128.0f),
                    PathNode.CurveTo(96.95431f, 128.0f, 88.0f, 119.04569f, 88.0f, 108.0f),
                    PathNode.CurveTo(88.0f, 96.95431f, 96.95431f, 88.0f, 108.0f, 88.0f),
                    PathNode.CurveTo(119.04569f, 88.0f, 128.0f, 96.95431f, 128.0f, 108.0f),
                    PathNode.CurveTo(128.0f, 119.04569f, 119.04569f, 128.0f, 108.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(168.0f, 108.0f),
                    PathNode.CurveTo(156.9543f, 108.0f, 148.0f, 116.95431f, 148.0f, 128.0f),
                    PathNode.CurveTo(148.0f, 139.0457f, 156.9543f, 148.0f, 168.0f, 148.0f),
                    PathNode.CurveTo(179.0457f, 148.0f, 188.0f, 139.0457f, 188.0f, 128.0f),
                    PathNode.CurveTo(188.0f, 116.95431f, 179.0457f, 108.0f, 168.0f, 108.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 148.0f),
                    PathNode.CurveTo(116.95431f, 148.0f, 108.0f, 156.9543f, 108.0f, 168.0f),
                    PathNode.CurveTo(108.0f, 179.0457f, 116.95431f, 188.0f, 128.0f, 188.0f),
                    PathNode.CurveTo(139.0457f, 188.0f, 148.0f, 179.0457f, 148.0f, 168.0f),
                    PathNode.CurveTo(148.0f, 156.9543f, 139.0457f, 148.0f, 128.0f, 148.0f),
                    PathNode.Close,
                    PathNode.MoveTo(252.0f, 128.0f),
                    PathNode.CurveTo(252.0f, 134.62741f, 246.62741f, 140.0f, 240.0f, 140.0f),
                    PathNode.LineTo(227.28f, 140.0f),
                    PathNode.CurveTo(225.09378f, 158.14095f, 217.9603f, 175.33116f, 206.66f, 189.69f),
                    PathNode.LineTo(216.49f, 199.51f),
                    PathNode.CurveTo(221.18442f, 204.20442f, 221.18442f, 211.81558f, 216.49f, 216.51f),
                    PathNode.CurveTo(211.79558f, 221.20442f, 204.18442f, 221.20442f, 199.49f, 216.51f),
                    PathNode.LineTo(189.67f, 206.68f),
                    PathNode.CurveTo(175.31459f, 217.96977f, 158.13193f, 225.09605f, 140.0f, 227.28f),
                    PathNode.LineTo(140.0f, 240.0f),
                    PathNode.CurveTo(140.0f, 246.62741f, 134.62741f, 252.0f, 128.0f, 252.0f),
                    PathNode.CurveTo(121.37258f, 252.0f, 116.0f, 246.62741f, 116.0f, 240.0f),
                    PathNode.LineTo(116.0f, 227.28f),
                    PathNode.CurveTo(97.85906f, 225.09378f, 80.66884f, 217.9603f, 66.31f, 206.66f),
                    PathNode.LineTo(56.49f, 216.49f),
                    PathNode.CurveTo(51.79558f, 221.18442f, 44.18442f, 221.18442f, 39.49f, 216.49f),
                    PathNode.CurveTo(34.79558f, 211.79558f, 34.79558f, 204.18442f, 39.49f, 199.49f),
                    PathNode.LineTo(49.32f, 189.67f),
                    PathNode.CurveTo(38.030235f, 175.31459f, 30.903942f, 158.13193f, 28.72f, 140.0f),
                    PathNode.LineTo(16.0f, 140.0f),
                    PathNode.CurveTo(9.372583f, 140.0f, 4.0f, 134.62741f, 4.0f, 128.0f),
                    PathNode.CurveTo(4.0f, 121.37258f, 9.372583f, 116.0f, 16.0f, 116.0f),
                    PathNode.LineTo(28.72f, 116.0f),
                    PathNode.CurveTo(30.906218f, 97.85906f, 38.039692f, 80.66884f, 49.34f, 66.31f),
                    PathNode.LineTo(39.51f, 56.49f),
                    PathNode.CurveTo(34.81558f, 51.79558f, 34.81558f, 44.18442f, 39.51f, 39.49f),
                    PathNode.CurveTo(44.20442f, 34.79558f, 51.81558f, 34.79558f, 56.51f, 39.49f),
                    PathNode.LineTo(66.33f, 49.32f),
                    PathNode.CurveTo(80.6854f, 38.030235f, 97.86807f, 30.903942f, 116.0f, 28.72f),
                    PathNode.LineTo(116.0f, 16.0f),
                    PathNode.CurveTo(116.0f, 9.372583f, 121.37258f, 4.0f, 128.0f, 4.0f),
                    PathNode.CurveTo(134.62741f, 4.0f, 140.0f, 9.372583f, 140.0f, 16.0f),
                    PathNode.LineTo(140.0f, 28.72f),
                    PathNode.CurveTo(158.14095f, 30.906218f, 175.33116f, 38.039692f, 189.69f, 49.34f),
                    PathNode.LineTo(199.51f, 39.51f),
                    PathNode.CurveTo(204.20442f, 34.81558f, 211.81558f, 34.81558f, 216.51f, 39.51f),
                    PathNode.CurveTo(221.20442f, 44.20442f, 221.20442f, 51.81558f, 216.51f, 56.51f),
                    PathNode.LineTo(206.68f, 66.33f),
                    PathNode.CurveTo(217.96977f, 80.6854f, 225.09605f, 97.86807f, 227.28f, 116.0f),
                    PathNode.LineTo(240.0f, 116.0f),
                    PathNode.CurveTo(246.62741f, 116.0f, 252.0f, 121.37258f, 252.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(204.0f, 128.0f),
                    PathNode.CurveTo(204.0f, 86.02636f, 169.97365f, 52.0f, 128.0f, 52.0f),
                    PathNode.CurveTo(86.02636f, 52.0f, 52.0f, 86.02636f, 52.0f, 128.0f),
                    PathNode.CurveTo(52.0f, 169.97365f, 86.02636f, 204.0f, 128.0f, 204.0f),
                    PathNode.CurveTo(169.95538f, 203.9559f, 203.9559f, 169.95538f, 204.0f, 128.0f),
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
        return _virus!!
    }

private var _virus: ImageVector? = null
