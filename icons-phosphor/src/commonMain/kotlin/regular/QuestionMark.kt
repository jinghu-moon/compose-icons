package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.QuestionMark: ImageVector
    get() {
        if (_questionMark != null) return _questionMark!!
        _questionMark = phosphorRegularIcon(
            name = "QuestionMark",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(192.0f, 96.0f),
                    PathNode.CurveTo(192.0f, 124.51f, 167.53f, 148.11f, 136.0f, 151.56f),
                    PathNode.LineTo(136.0f, 160.0f),
                    PathNode.CurveTo(136.0f, 164.41827f, 132.41827f, 168.0f, 128.0f, 168.0f),
                    PathNode.CurveTo(123.58172f, 168.0f, 120.0f, 164.41827f, 120.0f, 160.0f),
                    PathNode.LineTo(120.0f, 144.0f),
                    PathNode.CurveTo(120.0f, 139.58173f, 123.58172f, 136.0f, 128.0f, 136.0f),
                    PathNode.CurveTo(154.47f, 136.0f, 176.0f, 118.06f, 176.0f, 96.0f),
                    PathNode.CurveTo(176.0f, 73.94f, 154.47f, 56.0f, 128.0f, 56.0f),
                    PathNode.CurveTo(101.53f, 56.0f, 80.0f, 73.94f, 80.0f, 96.0f),
                    PathNode.CurveTo(80.0f, 100.41828f, 76.41828f, 104.0f, 72.0f, 104.0f),
                    PathNode.CurveTo(67.58172f, 104.0f, 64.0f, 100.41828f, 64.0f, 96.0f),
                    PathNode.CurveTo(64.0f, 65.12f, 92.71f, 40.0f, 128.0f, 40.0f),
                    PathNode.CurveTo(163.29f, 40.0f, 192.0f, 65.12f, 192.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 192.0f),
                    PathNode.CurveTo(119.163445f, 192.0f, 112.0f, 199.16344f, 112.0f, 208.0f),
                    PathNode.CurveTo(112.0f, 216.83656f, 119.163445f, 224.0f, 128.0f, 224.0f),
                    PathNode.CurveTo(136.83656f, 224.0f, 144.0f, 216.83656f, 144.0f, 208.0f),
                    PathNode.CurveTo(144.0f, 199.16344f, 136.83656f, 192.0f, 128.0f, 192.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _questionMark!!
    }

private var _questionMark: ImageVector? = null
