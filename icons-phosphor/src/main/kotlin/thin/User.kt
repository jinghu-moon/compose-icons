package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.User: ImageVector
    get() {
        if (_user != null) return _user!!
        _user = phosphorThinIcon(
            name = "User",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(227.46f, 214.0f),
                    PathNode.CurveTo(210.94f, 185.44f, 184.46f, 165.94f, 153.78f, 158.91f),
                    PathNode.CurveTo(183.84491f, 146.59233f, 200.99596f, 114.72702f, 194.71886f, 82.848785f),
                    PathNode.CurveTo(188.44176f, 50.970554f, 160.49036f, 27.986303f, 128.0f, 27.986303f),
                    PathNode.CurveTo(95.50963f, 27.986303f, 67.55824f, 50.970554f, 61.281143f, 82.848785f),
                    PathNode.CurveTo(55.004047f, 114.72702f, 72.15509f, 146.59233f, 102.22f, 158.91f),
                    PathNode.CurveTo(71.58f, 165.91f, 45.06f, 185.44f, 28.54f, 214.0f),
                    PathNode.CurveTo(27.546392f, 215.8994f, 28.226706f, 218.24443f, 30.08256f, 219.31717f),
                    PathNode.CurveTo(31.938414f, 220.38992f, 34.310017f, 219.809f, 35.46f, 218.0f),
                    PathNode.CurveTo(55.0f, 184.19f, 89.62f, 164.0f, 128.0f, 164.0f),
                    PathNode.CurveTo(166.38f, 164.0f, 201.0f, 184.19f, 220.54f, 218.0f),
                    PathNode.CurveTo(221.2538f, 219.23634f, 222.5724f, 219.99854f, 224.0f, 220.0f),
                    PathNode.CurveTo(224.70296f, 220.0021f, 225.39363f, 219.81563f, 226.0f, 219.46f),
                    PathNode.CurveTo(227.90923f, 218.35414f, 228.56247f, 215.91118f, 227.46f, 214.0f),
                    PathNode.Close,
                    PathNode.MoveTo(68.0f, 96.0f),
                    PathNode.CurveTo(68.0f, 62.862915f, 94.862915f, 36.0f, 128.0f, 36.0f),
                    PathNode.CurveTo(161.13708f, 36.0f, 188.0f, 62.862915f, 188.0f, 96.0f),
                    PathNode.CurveTo(188.0f, 129.13708f, 161.13708f, 156.0f, 128.0f, 156.0f),
                    PathNode.CurveTo(94.87891f, 155.96143f, 68.038574f, 129.1211f, 68.0f, 96.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _user!!
    }

private var _user: ImageVector? = null
