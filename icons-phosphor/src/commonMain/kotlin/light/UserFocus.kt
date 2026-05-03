package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.UserFocus: ImageVector
    get() {
        if (_userFocus != null) return _userFocus!!
        _userFocus = phosphorLightIcon(
            name = "UserFocus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(222.0f, 40.0f),
                    PathNode.LineTo(222.0f, 76.0f),
                    PathNode.CurveTo(222.0f, 79.313705f, 219.3137f, 82.0f, 216.0f, 82.0f),
                    PathNode.CurveTo(212.6863f, 82.0f, 210.0f, 79.313705f, 210.0f, 76.0f),
                    PathNode.LineTo(210.0f, 46.0f),
                    PathNode.LineTo(180.0f, 46.0f),
                    PathNode.CurveTo(176.6863f, 46.0f, 174.0f, 43.31371f, 174.0f, 40.0f),
                    PathNode.CurveTo(174.0f, 36.68629f, 176.6863f, 34.0f, 180.0f, 34.0f),
                    PathNode.LineTo(216.0f, 34.0f),
                    PathNode.CurveTo(219.3137f, 34.0f, 222.0f, 36.68629f, 222.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 174.0f),
                    PathNode.CurveTo(212.6863f, 174.0f, 210.0f, 176.6863f, 210.0f, 180.0f),
                    PathNode.LineTo(210.0f, 210.0f),
                    PathNode.LineTo(180.0f, 210.0f),
                    PathNode.CurveTo(176.6863f, 210.0f, 174.0f, 212.6863f, 174.0f, 216.0f),
                    PathNode.CurveTo(174.0f, 219.3137f, 176.6863f, 222.0f, 180.0f, 222.0f),
                    PathNode.LineTo(216.0f, 222.0f),
                    PathNode.CurveTo(219.3137f, 222.0f, 222.0f, 219.3137f, 222.0f, 216.0f),
                    PathNode.LineTo(222.0f, 180.0f),
                    PathNode.CurveTo(222.0f, 176.6863f, 219.3137f, 174.0f, 216.0f, 174.0f),
                    PathNode.Close,
                    PathNode.MoveTo(76.0f, 210.0f),
                    PathNode.LineTo(46.0f, 210.0f),
                    PathNode.LineTo(46.0f, 180.0f),
                    PathNode.CurveTo(46.0f, 176.6863f, 43.31371f, 174.0f, 40.0f, 174.0f),
                    PathNode.CurveTo(36.68629f, 174.0f, 34.0f, 176.6863f, 34.0f, 180.0f),
                    PathNode.LineTo(34.0f, 216.0f),
                    PathNode.CurveTo(34.0f, 219.3137f, 36.68629f, 222.0f, 40.0f, 222.0f),
                    PathNode.LineTo(76.0f, 222.0f),
                    PathNode.CurveTo(79.313705f, 222.0f, 82.0f, 219.3137f, 82.0f, 216.0f),
                    PathNode.CurveTo(82.0f, 212.6863f, 79.313705f, 210.0f, 76.0f, 210.0f),
                    PathNode.Close,
                    PathNode.MoveTo(40.0f, 82.0f),
                    PathNode.CurveTo(43.31371f, 82.0f, 46.0f, 79.313705f, 46.0f, 76.0f),
                    PathNode.LineTo(46.0f, 46.0f),
                    PathNode.LineTo(76.0f, 46.0f),
                    PathNode.CurveTo(79.313705f, 46.0f, 82.0f, 43.31371f, 82.0f, 40.0f),
                    PathNode.CurveTo(82.0f, 36.68629f, 79.313705f, 34.0f, 76.0f, 34.0f),
                    PathNode.LineTo(40.0f, 34.0f),
                    PathNode.CurveTo(36.68629f, 34.0f, 34.0f, 36.68629f, 34.0f, 40.0f),
                    PathNode.LineTo(34.0f, 76.0f),
                    PathNode.CurveTo(34.0f, 79.313705f, 36.68629f, 82.0f, 40.0f, 82.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 174.0f),
                    PathNode.CurveTo(174.11145f, 174.0f, 172.33313f, 173.11082f, 171.2f, 171.6f),
                    PathNode.CurveTo(161.00186f, 158.00249f, 144.99689f, 150.0f, 128.0f, 150.0f),
                    PathNode.CurveTo(111.003105f, 150.0f, 94.99814f, 158.00249f, 84.8f, 171.6f),
                    PathNode.CurveTo(82.811775f, 174.25096f, 79.050964f, 174.78822f, 76.4f, 172.8f),
                    PathNode.CurveTo(73.74903f, 170.81177f, 73.21178f, 167.05096f, 75.2f, 164.4f),
                    PathNode.CurveTo(82.75006f, 154.2792f, 93.058586f, 146.55042f, 104.89f, 142.14f),
                    PathNode.CurveTo(91.96287f, 132.23627f, 86.7833f, 115.196526f, 92.01202f, 99.77397f),
                    PathNode.CurveTo(97.24072f, 84.35142f, 111.7152f, 73.97499f, 128.0f, 73.97499f),
                    PathNode.CurveTo(144.28479f, 73.97499f, 158.75928f, 84.35142f, 163.98799f, 99.77397f),
                    PathNode.CurveTo(169.2167f, 115.196526f, 164.03714f, 132.23627f, 151.11f, 142.14f),
                    PathNode.CurveTo(162.9414f, 146.55042f, 173.24994f, 154.2792f, 180.8f, 164.4f),
                    PathNode.CurveTo(182.16357f, 166.21811f, 182.38292f, 168.65057f, 181.36656f, 170.68329f),
                    PathNode.CurveTo(180.3502f, 172.71599f, 178.27263f, 174.0f, 176.0f, 174.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 138.0f),
                    PathNode.CurveTo(142.3594f, 138.0f, 154.0f, 126.359406f, 154.0f, 112.0f),
                    PathNode.CurveTo(154.0f, 97.640594f, 142.3594f, 86.0f, 128.0f, 86.0f),
                    PathNode.CurveTo(113.640594f, 86.0f, 102.0f, 97.640594f, 102.0f, 112.0f),
                    PathNode.CurveTo(102.0f, 126.359406f, 113.640594f, 138.0f, 128.0f, 138.0f),
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
        return _userFocus!!
    }

private var _userFocus: ImageVector? = null
