package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.MusicNotes: ImageVector
    get() {
        if (_musicNotes != null) return _musicNotes!!
        _musicNotes = phosphorFillIcon(
            name = "MusicNotes",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(212.92f, 17.71f),
                    PathNode.CurveTo(210.98721f, 16.177877f, 208.44917f, 15.637712f, 206.06f, 16.25f),
                    PathNode.LineTo(78.06f, 48.25f),
                    PathNode.CurveTo(74.50258f, 49.139214f, 72.00514f, 52.33313f, 72.0f, 56.0f),
                    PathNode.LineTo(72.0f, 166.1f),
                    PathNode.CurveTo(58.267178f, 156.92438f, 40.052296f, 158.2704f, 27.817368f, 169.36494f),
                    PathNode.CurveTo(15.58244f, 180.45949f, 12.46634f, 198.45625f, 20.258848f, 213.01851f),
                    PathNode.CurveTo(28.05136f, 227.58076f, 44.753307f, 234.97255f, 60.771664f, 230.94829f),
                    PathNode.CurveTo(76.790016f, 226.92401f, 88.01527f, 212.51611f, 88.0f, 196.0f),
                    PathNode.LineTo(88.0f, 102.25f),
                    PathNode.LineTo(200.0f, 74.25f),
                    PathNode.LineTo(200.0f, 134.1f),
                    PathNode.CurveTo(186.26718f, 124.924385f, 168.05229f, 126.2704f, 155.81737f, 137.36494f),
                    PathNode.CurveTo(143.58244f, 148.45949f, 140.46634f, 166.45625f, 148.25885f, 181.01851f),
                    PathNode.CurveTo(156.05136f, 195.58076f, 172.75331f, 202.97255f, 188.77167f, 198.94829f),
                    PathNode.CurveTo(204.79001f, 194.92401f, 216.01526f, 180.51611f, 216.0f, 164.0f),
                    PathNode.LineTo(216.0f, 24.0f),
                    PathNode.CurveTo(215.9944f, 21.541447f, 214.85864f, 19.222008f, 212.92f, 17.71f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _musicNotes!!
    }

private var _musicNotes: ImageVector? = null
