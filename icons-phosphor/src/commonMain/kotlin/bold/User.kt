package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.User: ImageVector
    get() {
        if (_user != null) return _user!!
        _user = phosphorBoldIcon(
            name = "User",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(234.38f, 210.0f),
                    PathNode.CurveTo(220.66957f, 185.93704f, 199.26077f, 167.18762f, 173.6f, 156.77f),
                    PathNode.CurveTo(199.77017f, 137.14238f, 210.4446f, 102.970695f, 200.09993f, 71.93669f),
                    PathNode.CurveTo(189.75526f, 40.902687f, 160.7127f, 19.97f, 128.0f, 19.97f),
                    PathNode.CurveTo(95.28729f, 19.97f, 66.244736f, 40.902687f, 55.90007f, 71.93669f),
                    PathNode.CurveTo(45.5554f, 102.970695f, 56.22983f, 137.14238f, 82.4f, 156.77f),
                    PathNode.CurveTo(56.739223f, 167.18762f, 35.330433f, 185.93704f, 21.62f, 210.0f),
                    PathNode.CurveTo(19.306807f, 213.7195f, 19.20396f, 218.40387f, 21.351677f, 222.22131f),
                    PathNode.CurveTo(23.499393f, 226.03876f, 27.556446f, 228.38274f, 31.936333f, 228.33667f),
                    PathNode.CurveTo(36.31622f, 228.29059f, 40.323063f, 225.86177f, 42.39f, 222.0f),
                    PathNode.CurveTo(60.51f, 190.68f, 92.51f, 172.0f, 128.0f, 172.0f),
                    PathNode.CurveTo(163.49f, 172.0f, 195.49f, 190.69f, 213.61f, 222.0f),
                    PathNode.CurveTo(217.02992f, 227.49905f, 224.19609f, 229.29274f, 229.80327f, 226.05315f),
                    PathNode.CurveTo(235.41045f, 222.81357f, 237.43584f, 215.7094f, 234.38f, 210.0f),
                    PathNode.Close,
                    PathNode.MoveTo(76.0f, 96.0f),
                    PathNode.CurveTo(76.0f, 67.2812f, 99.2812f, 44.0f, 128.0f, 44.0f),
                    PathNode.CurveTo(156.71881f, 44.0f, 180.0f, 67.2812f, 180.0f, 96.0f),
                    PathNode.CurveTo(180.0f, 124.7188f, 156.71881f, 148.0f, 128.0f, 148.0f),
                    PathNode.CurveTo(99.2949f, 147.96693f, 76.033066f, 124.7051f, 76.0f, 96.0f),
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
        return _user!!
    }

private var _user: ImageVector? = null
