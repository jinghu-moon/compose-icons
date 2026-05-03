package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.HandGrabbing: ImageVector
    get() {
        if (_handGrabbing != null) return _handGrabbing!!
        _handGrabbing = phosphorLightIcon(
            name = "HandGrabbing",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(188.0f, 82.0f),
                    PathNode.CurveTo(182.79556f, 81.99382f, 177.71045f, 83.55874f, 173.41f, 86.49f),
                    PathNode.CurveTo(171.2961f, 76.77478f, 163.82677f, 69.11576f, 154.1676f, 66.758934f),
                    PathNode.CurveTo(144.50845f, 64.40211f, 134.35097f, 67.7602f, 128.0f, 75.41f),
                    PathNode.CurveTo(121.0034f, 66.987076f, 109.479546f, 63.850395f, 99.17916f, 67.56525f),
                    PathNode.CurveTo(88.878784f, 71.280106f, 82.00979f, 81.05021f, 82.0f, 92.0f),
                    PathNode.LineTo(82.0f, 114.0f),
                    PathNode.LineTo(68.0f, 114.0f),
                    PathNode.CurveTo(53.6406f, 114.0f, 42.0f, 125.640594f, 42.0f, 140.0f),
                    PathNode.LineTo(42.0f, 152.0f),
                    PathNode.CurveTo(42.0f, 199.49649f, 80.50351f, 238.0f, 128.0f, 238.0f),
                    PathNode.CurveTo(175.49649f, 238.0f, 214.0f, 199.49649f, 214.0f, 152.0f),
                    PathNode.LineTo(214.0f, 108.0f),
                    PathNode.CurveTo(214.0f, 93.640594f, 202.3594f, 82.0f, 188.0f, 82.0f),
                    PathNode.Close,
                    PathNode.MoveTo(202.0f, 152.0f),
                    PathNode.CurveTo(202.0f, 192.86908f, 168.86908f, 226.0f, 128.0f, 226.0f),
                    PathNode.CurveTo(87.13093f, 226.0f, 54.0f, 192.86908f, 54.0f, 152.0f),
                    PathNode.LineTo(54.0f, 140.0f),
                    PathNode.CurveTo(54.0f, 132.26802f, 60.268013f, 126.0f, 68.0f, 126.0f),
                    PathNode.LineTo(82.0f, 126.0f),
                    PathNode.LineTo(82.0f, 152.0f),
                    PathNode.CurveTo(82.0f, 155.3137f, 84.686295f, 158.0f, 88.0f, 158.0f),
                    PathNode.CurveTo(91.313705f, 158.0f, 94.0f, 155.3137f, 94.0f, 152.0f),
                    PathNode.LineTo(94.0f, 92.0f),
                    PathNode.CurveTo(94.0f, 84.26801f, 100.26801f, 78.0f, 108.0f, 78.0f),
                    PathNode.CurveTo(115.73199f, 78.0f, 122.0f, 84.26801f, 122.0f, 92.0f),
                    PathNode.LineTo(122.0f, 120.0f),
                    PathNode.CurveTo(122.0f, 123.313705f, 124.686295f, 126.0f, 128.0f, 126.0f),
                    PathNode.CurveTo(131.3137f, 126.0f, 134.0f, 123.313705f, 134.0f, 120.0f),
                    PathNode.LineTo(134.0f, 92.0f),
                    PathNode.CurveTo(134.0f, 84.26801f, 140.26802f, 78.0f, 148.0f, 78.0f),
                    PathNode.CurveTo(155.73198f, 78.0f, 162.0f, 84.26801f, 162.0f, 92.0f),
                    PathNode.LineTo(162.0f, 120.0f),
                    PathNode.CurveTo(162.0f, 123.313705f, 164.6863f, 126.0f, 168.0f, 126.0f),
                    PathNode.CurveTo(171.3137f, 126.0f, 174.0f, 123.313705f, 174.0f, 120.0f),
                    PathNode.LineTo(174.0f, 108.0f),
                    PathNode.CurveTo(174.0f, 100.26801f, 180.26802f, 94.0f, 188.0f, 94.0f),
                    PathNode.CurveTo(195.73198f, 94.0f, 202.0f, 100.26801f, 202.0f, 108.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _handGrabbing!!
    }

private var _handGrabbing: ImageVector? = null
