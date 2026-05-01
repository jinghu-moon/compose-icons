package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.UserSquare: ImageVector
    get() {
        if (_userSquare != null) return _userSquare!!
        _userSquare = phosphorBoldIcon(
            name = "UserSquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 28.0f),
                    PathNode.LineTo(48.0f, 28.0f),
                    PathNode.CurveTo(36.954304f, 28.0f, 28.0f, 36.954304f, 28.0f, 48.0f),
                    PathNode.LineTo(28.0f, 208.0f),
                    PathNode.CurveTo(28.0f, 219.0457f, 36.954304f, 228.0f, 48.0f, 228.0f),
                    PathNode.LineTo(208.0f, 228.0f),
                    PathNode.CurveTo(219.0457f, 228.0f, 228.0f, 219.0457f, 228.0f, 208.0f),
                    PathNode.LineTo(228.0f, 48.0f),
                    PathNode.CurveTo(228.0f, 36.954304f, 219.0457f, 28.0f, 208.0f, 28.0f),
                    PathNode.Close,
                    PathNode.MoveTo(204.0f, 52.0f),
                    PathNode.LineTo(204.0f, 196.24f),
                    PathNode.CurveTo(195.88756f, 178.9406f, 182.09592f, 164.94073f, 164.92f, 156.57f),
                    PathNode.CurveTo(185.10475f, 136.21904f, 185.01497f, 103.37205f, 164.71927f, 83.131744f),
                    PathNode.CurveTo(144.42355f, 62.891438f, 111.57644f, 62.891438f, 91.28073f, 83.131744f),
                    PathNode.CurveTo(70.98503f, 103.37205f, 70.89525f, 136.21904f, 91.08f, 156.57f),
                    PathNode.CurveTo(73.90408f, 164.94073f, 60.11244f, 178.9406f, 52.0f, 196.24f),
                    PathNode.LineTo(52.0f, 52.0f),
                    PathNode.Close,
                    PathNode.MoveTo(100.0f, 120.0f),
                    PathNode.CurveTo(100.0f, 104.536026f, 112.536026f, 92.0f, 128.0f, 92.0f),
                    PathNode.CurveTo(143.46397f, 92.0f, 156.0f, 104.536026f, 156.0f, 120.0f),
                    PathNode.CurveTo(156.0f, 135.46397f, 143.46397f, 148.0f, 128.0f, 148.0f),
                    PathNode.CurveTo(112.536026f, 148.0f, 100.0f, 135.46397f, 100.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 172.0f),
                    PathNode.CurveTo(141.72452f, 171.94455f, 155.04393f, 176.64821f, 165.69f, 185.31f),
                    PathNode.CurveTo(172.02065f, 190.4404f, 177.24872f, 196.79776f, 181.06f, 204.0f),
                    PathNode.LineTo(74.94f, 204.0f),
                    PathNode.CurveTo(78.75129f, 196.79776f, 83.97935f, 190.4404f, 90.31f, 185.31f),
                    PathNode.CurveTo(100.95608f, 176.64821f, 114.27548f, 171.94455f, 128.0f, 172.0f),
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
        return _userSquare!!
    }

private var _userSquare: ImageVector? = null
