package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.GenderNeuter: ImageVector
    get() {
        if (_genderNeuter != null) return _genderNeuter!!
        _genderNeuter = phosphorBoldIcon(
            name = "GenderNeuter",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(212.0f, 104.0f),
                    PathNode.CurveTo(212.0045f, 59.16681f, 176.7997f, 22.232132f, 132.01782f, 20.087706f),
                    PathNode.CurveTo(87.23595f, 17.943277f, 48.663013f, 51.34503f, 44.38355f, 95.97351f),
                    PathNode.CurveTo(40.104088f, 140.60199f, 71.62665f, 180.72527f, 116.0f, 187.13f),
                    PathNode.LineTo(116.0f, 232.0f),
                    PathNode.CurveTo(116.0f, 238.62741f, 121.37258f, 244.0f, 128.0f, 244.0f),
                    PathNode.CurveTo(134.62741f, 244.0f, 140.0f, 238.62741f, 140.0f, 232.0f),
                    PathNode.LineTo(140.0f, 187.13f),
                    PathNode.CurveTo(181.29852f, 181.117f, 211.94427f, 145.73393f, 212.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 164.0f),
                    PathNode.CurveTo(94.862915f, 164.0f, 68.0f, 137.13708f, 68.0f, 104.0f),
                    PathNode.CurveTo(68.0f, 70.862915f, 94.862915f, 44.0f, 128.0f, 44.0f),
                    PathNode.CurveTo(161.13708f, 44.0f, 188.0f, 70.862915f, 188.0f, 104.0f),
                    PathNode.CurveTo(187.96143f, 137.1211f, 161.1211f, 163.96143f, 128.0f, 164.0f),
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
        return _genderNeuter!!
    }

private var _genderNeuter: ImageVector? = null
