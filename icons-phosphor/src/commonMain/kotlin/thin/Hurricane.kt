package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Hurricane: ImageVector
    get() {
        if (_hurricane != null) return _hurricane!!
        _hurricane = phosphorThinIcon(
            name = "Hurricane",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 100.0f),
                    PathNode.CurveTo(112.536026f, 100.0f, 100.0f, 112.536026f, 100.0f, 128.0f),
                    PathNode.CurveTo(100.0f, 143.46397f, 112.536026f, 156.0f, 128.0f, 156.0f),
                    PathNode.CurveTo(143.46397f, 156.0f, 156.0f, 143.46397f, 156.0f, 128.0f),
                    PathNode.CurveTo(156.0f, 112.536026f, 143.46397f, 100.0f, 128.0f, 100.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 148.0f),
                    PathNode.CurveTo(116.95431f, 148.0f, 108.0f, 139.0457f, 108.0f, 128.0f),
                    PathNode.CurveTo(108.0f, 116.95431f, 116.95431f, 108.0f, 128.0f, 108.0f),
                    PathNode.CurveTo(139.0457f, 108.0f, 148.0f, 116.95431f, 148.0f, 128.0f),
                    PathNode.CurveTo(148.0f, 139.0457f, 139.0457f, 148.0f, 128.0f, 148.0f),
                    PathNode.Close,
                    PathNode.MoveTo(153.49f, 47.94f),
                    PathNode.LineTo(163.87f, 9.0f),
                    PathNode.CurveTo(164.22885f, 7.653792f, 163.86137f, 6.217853f, 162.89998f, 5.209508f),
                    PathNode.CurveTo(161.93858f, 4.201163f, 160.52177f, 3.765699f, 159.16f, 4.06f),
                    PathNode.CurveTo(138.84048f, 9.052083f, 119.47696f, 17.342049f, 101.84f, 28.6f),
                    PathNode.CurveTo(64.0f, 53.0f, 44.0f, 87.32f, 44.0f, 128.0f),
                    PathNode.CurveTo(44.016342f, 164.57144f, 67.670746f, 196.93808f, 102.51f, 208.06f),
                    PathNode.LineTo(92.13f, 247.0f),
                    PathNode.CurveTo(91.77116f, 248.3462f, 92.138626f, 249.78215f, 93.10002f, 250.7905f),
                    PathNode.CurveTo(94.061424f, 251.79884f, 95.478226f, 252.2343f, 96.84f, 251.94f),
                    PathNode.CurveTo(117.16088f, 246.94705f, 136.5248f, 238.65353f, 154.16f, 227.39f),
                    PathNode.CurveTo(192.0f, 203.0f, 212.0f, 168.68f, 212.0f, 128.0f),
                    PathNode.CurveTo(211.98366f, 91.42856f, 188.32925f, 59.061928f, 153.49f, 47.94f),
                    PathNode.Close,
                    PathNode.MoveTo(150.0f, 220.51f),
                    PathNode.CurveTo(134.97246f, 230.02773f, 118.68363f, 237.38951f, 101.61f, 242.38f),
                    PathNode.LineTo(111.22f, 206.38f),
                    PathNode.CurveTo(111.49448f, 205.35356f, 111.34931f, 204.2601f, 110.81652f, 203.34084f),
                    PathNode.CurveTo(110.28372f, 202.42157f, 109.40708f, 201.75206f, 108.38f, 201.48f),
                    PathNode.CurveTo(75.12134f, 192.57117f, 51.99541f, 162.43118f, 52.0f, 128.0f),
                    PathNode.CurveTo(52.0f, 89.71f, 70.16f, 58.59f, 106.0f, 35.49f),
                    PathNode.CurveTo(121.027534f, 25.972277f, 137.31636f, 18.61049f, 154.39f, 13.62f),
                    PathNode.LineTo(144.78f, 49.62f),
                    PathNode.CurveTo(144.50551f, 50.646435f, 144.65068f, 51.739906f, 145.18349f, 52.659164f),
                    PathNode.CurveTo(145.71628f, 53.578426f, 146.59291f, 54.24794f, 147.62f, 54.52f),
                    PathNode.CurveTo(180.87866f, 63.42883f, 204.0046f, 93.568825f, 204.0f, 128.0f),
                    PathNode.CurveTo(204.0f, 166.29f, 185.84f, 197.41f, 150.0f, 220.51f),
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
        return _hurricane!!
    }

private var _hurricane: ImageVector? = null
