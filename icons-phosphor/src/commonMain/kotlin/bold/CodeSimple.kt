package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CodeSimple: ImageVector
    get() {
        if (_codeSimple != null) return _codeSimple!!
        _codeSimple = phosphorBoldIcon(
            name = "CodeSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(96.0f, 73.0f),
                    PathNode.LineTo(34.06f, 128.0f),
                    PathNode.LineTo(96.0f, 183.0f),
                    PathNode.CurveTo(100.970566f, 187.41827f, 101.41828f, 195.02943f, 97.0f, 200.0f),
                    PathNode.CurveTo(92.58172f, 204.97057f, 84.970566f, 205.41827f, 80.0f, 201.0f),
                    PathNode.LineTo(8.0f, 137.0f),
                    PathNode.CurveTo(5.416995f, 134.722f, 3.937254f, 131.444f, 3.937254f, 128.0f),
                    PathNode.CurveTo(3.937254f, 124.55599f, 5.416995f, 121.278f, 8.0f, 119.0f),
                    PathNode.LineTo(80.0f, 55.0f),
                    PathNode.CurveTo(84.970566f, 50.581722f, 92.58172f, 51.02944f, 97.0f, 56.0f),
                    PathNode.CurveTo(101.41828f, 60.97056f, 100.970566f, 68.58172f, 96.0f, 73.0f),
                    PathNode.Close,
                    PathNode.MoveTo(248.0f, 119.0f),
                    PathNode.LineTo(176.0f, 55.0f),
                    PathNode.CurveTo(171.02943f, 50.581722f, 163.41827f, 51.02944f, 159.0f, 56.0f),
                    PathNode.CurveTo(154.58173f, 60.97056f, 155.02943f, 68.58172f, 160.0f, 73.0f),
                    PathNode.LineTo(221.91f, 128.0f),
                    PathNode.LineTo(160.0f, 183.0f),
                    PathNode.CurveTo(155.02943f, 187.41827f, 154.58173f, 195.02943f, 159.0f, 200.0f),
                    PathNode.CurveTo(163.41827f, 204.97057f, 171.02943f, 205.41827f, 176.0f, 201.0f),
                    PathNode.LineTo(248.0f, 137.0f),
                    PathNode.CurveTo(250.58301f, 134.722f, 252.06276f, 131.444f, 252.06276f, 128.0f),
                    PathNode.CurveTo(252.06276f, 124.55599f, 250.58301f, 121.278f, 248.0f, 119.0f),
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
        return _codeSimple!!
    }

private var _codeSimple: ImageVector? = null
