package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PaperPlaneRight: ImageVector
    get() {
        if (_paperPlaneRight != null) return _paperPlaneRight!!
        _paperPlaneRight = phosphorThinIcon(
            name = "PaperPlaneRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(229.89f, 117.43f),
                    PathNode.LineTo(61.89f, 21.55f),
                    PathNode.CurveTo(57.534283f, 19.10673f, 52.12068f, 19.616608f, 48.297756f, 22.830181f),
                    PathNode.CurveTo(44.474827f, 26.043753f, 43.041893f, 31.289108f, 44.7f, 36.0f),
                    PathNode.LineTo(75.78f, 128.0f),
                    PathNode.LineTo(44.71f, 220.0f),
                    PathNode.CurveTo(43.412846f, 223.66888f, 43.975315f, 227.73895f, 46.2189f, 230.91853f),
                    PathNode.CurveTo(48.46248f, 234.0981f, 52.10857f, 235.99231f, 56.0f, 236.0f),
                    PathNode.CurveTo(58.078533f, 235.99338f, 60.120495f, 235.45276f, 61.93f, 234.43f),
                    PathNode.LineTo(229.87f, 138.35f),
                    PathNode.CurveTo(233.64961f, 136.22488f, 235.98882f, 132.22607f, 235.98882f, 127.89f),
                    PathNode.CurveTo(235.98882f, 123.553925f, 233.64961f, 119.55511f, 229.87f, 117.43f),
                    PathNode.Close,
                    PathNode.MoveTo(225.89f, 131.43f),
                    PathNode.LineTo(58.0f, 227.47f),
                    PathNode.CurveTo(56.54613f, 228.28192f, 54.741344f, 228.10818f, 53.469044f, 227.03386f),
                    PathNode.CurveTo(52.196743f, 225.95952f, 51.72312f, 224.20934f, 52.28f, 222.64f),
                    PathNode.LineTo(52.28f, 222.57f),
                    PathNode.LineTo(82.87f, 132.0f),
                    PathNode.LineTo(144.0f, 132.0f),
                    PathNode.CurveTo(146.20914f, 132.0f, 148.0f, 130.20914f, 148.0f, 128.0f),
                    PathNode.CurveTo(148.0f, 125.79086f, 146.20914f, 124.0f, 144.0f, 124.0f),
                    PathNode.LineTo(82.87f, 124.0f),
                    PathNode.LineTo(52.26f, 33.37f),
                    PathNode.CurveTo(51.67808f, 31.810888f, 52.1524f, 30.0543f, 53.44f, 29.0f),
                    PathNode.CurveTo(54.154144f, 28.384182f, 55.057526f, 28.0313f, 56.0f, 28.0f),
                    PathNode.CurveTo(56.679523f, 28.007877f, 57.34506f, 28.19409f, 57.93f, 28.54f),
                    PathNode.LineTo(225.93f, 124.41f),
                    PathNode.CurveTo(227.20326f, 125.11448f, 227.99352f, 126.45484f, 227.99352f, 127.91f),
                    PathNode.CurveTo(227.99352f, 129.36516f, 227.20326f, 130.70552f, 225.93f, 131.41f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _paperPlaneRight!!
    }

private var _paperPlaneRight: ImageVector? = null
