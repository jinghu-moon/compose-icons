package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Password: ImageVector
    get() {
        if (_password != null) return _password!!
        _password = phosphorBoldIcon(
            name = "Password",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(48.0f, 56.0f),
                    PathNode.LineTo(48.0f, 200.0f),
                    PathNode.CurveTo(48.0f, 206.62741f, 42.62742f, 212.0f, 36.0f, 212.0f),
                    PathNode.CurveTo(29.372583f, 212.0f, 24.0f, 206.62741f, 24.0f, 200.0f),
                    PathNode.LineTo(24.0f, 56.0f),
                    PathNode.CurveTo(24.0f, 49.37258f, 29.372583f, 44.0f, 36.0f, 44.0f),
                    PathNode.CurveTo(42.62742f, 44.0f, 48.0f, 49.37258f, 48.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(134.73f, 106.7f),
                    PathNode.LineTo(120.0f, 111.48f),
                    PathNode.LineTo(120.0f, 96.0f),
                    PathNode.CurveTo(120.0f, 89.37258f, 114.62742f, 84.0f, 108.0f, 84.0f),
                    PathNode.CurveTo(101.37258f, 84.0f, 96.0f, 89.37258f, 96.0f, 96.0f),
                    PathNode.LineTo(96.0f, 111.48f),
                    PathNode.LineTo(81.27f, 106.7f),
                    PathNode.CurveTo(77.16021f, 105.25428f, 72.5897f, 106.14959f, 69.32912f, 109.03906f),
                    PathNode.CurveTo(66.068535f, 111.92854f, 64.63015f, 116.35824f, 65.5712f, 120.612045f),
                    PathNode.CurveTo(66.51224f, 124.86585f, 69.684875f, 128.27548f, 73.86f, 129.52f),
                    PathNode.LineTo(88.58f, 134.31f),
                    PathNode.LineTo(79.48f, 146.83f),
                    PathNode.CurveTo(75.58363f, 152.19269f, 76.77231f, 159.69862f, 82.135f, 163.595f),
                    PathNode.CurveTo(87.49769f, 167.49136f, 95.00363f, 166.30269f, 98.9f, 160.94f),
                    PathNode.LineTo(108.0f, 148.42f),
                    PathNode.LineTo(117.1f, 160.94f),
                    PathNode.CurveTo(120.99637f, 166.30269f, 128.50232f, 167.49136f, 133.865f, 163.595f),
                    PathNode.CurveTo(139.22769f, 159.69862f, 140.41637f, 152.19269f, 136.52f, 146.83f),
                    PathNode.LineTo(127.42f, 134.31f),
                    PathNode.LineTo(142.14f, 129.52f),
                    PathNode.CurveTo(146.31512f, 128.27548f, 149.48776f, 124.86585f, 150.4288f, 120.612045f),
                    PathNode.CurveTo(151.36986f, 116.35824f, 149.93146f, 111.92854f, 146.67088f, 109.03906f),
                    PathNode.CurveTo(143.41031f, 106.14959f, 138.83978f, 105.25428f, 134.73f, 106.7f),
                    PathNode.Close,
                    PathNode.MoveTo(249.85f, 114.4f),
                    PathNode.CurveTo(247.80013f, 108.099205f, 241.03148f, 104.652214f, 234.73f, 106.7f),
                    PathNode.LineTo(220.0f, 111.48f),
                    PathNode.LineTo(220.0f, 96.0f),
                    PathNode.CurveTo(220.0f, 89.37258f, 214.62741f, 84.0f, 208.0f, 84.0f),
                    PathNode.CurveTo(201.37259f, 84.0f, 196.0f, 89.37258f, 196.0f, 96.0f),
                    PathNode.LineTo(196.0f, 111.48f),
                    PathNode.LineTo(181.27f, 106.7f),
                    PathNode.CurveTo(177.16022f, 105.25428f, 172.58969f, 106.14959f, 169.32912f, 109.03906f),
                    PathNode.CurveTo(166.06854f, 111.92854f, 164.63014f, 116.35824f, 165.5712f, 120.612045f),
                    PathNode.CurveTo(166.51224f, 124.86585f, 169.68488f, 128.27548f, 173.86f, 129.52f),
                    PathNode.LineTo(188.58f, 134.31f),
                    PathNode.LineTo(179.48f, 146.83f),
                    PathNode.CurveTo(175.58363f, 152.19269f, 176.77231f, 159.69862f, 182.135f, 163.595f),
                    PathNode.CurveTo(187.49768f, 167.49136f, 195.00363f, 166.30269f, 198.9f, 160.94f),
                    PathNode.LineTo(208.0f, 148.42f),
                    PathNode.LineTo(217.1f, 160.94f),
                    PathNode.CurveTo(220.99637f, 166.30269f, 228.50232f, 167.49136f, 233.865f, 163.595f),
                    PathNode.CurveTo(239.22769f, 159.69862f, 240.41637f, 152.19269f, 236.52f, 146.83f),
                    PathNode.LineTo(227.42f, 134.31f),
                    PathNode.LineTo(242.14f, 129.52f),
                    PathNode.CurveTo(245.16763f, 128.53764f, 247.68095f, 126.39266f, 249.1269f, 123.55702f),
                    PathNode.CurveTo(250.57286f, 120.72138f, 250.83296f, 117.427444f, 249.85f, 114.4f),
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
        return _password!!
    }

private var _password: ImageVector? = null
