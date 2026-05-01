package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Rotate3D: ImageVector
    get() {
        if (_rotate3D != null) return _rotate3D!!
        _rotate3D = lucideOutlineIcon(
            name = "Rotate3D",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(15.194f, 13.707f),
                    PathNode.LineTo(19.008f, 15.567f),
                    PathNode.LineTo(17.148f, 19.381f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(16.47214f, 7.52786f),
                    PathNode.CurveTo(15.312867f, 2.890774f, 12.573893f, 0.794606f, 10.162978f, 2.69939f),
                    PathNode.CurveTo(7.752065f, 4.604173f, 6.46882f, 9.878164f, 7.207055f, 14.847898f),
                    PathNode.CurveTo(7.945291f, 19.817633f, 10.460162f, 22.834839f, 13.0f, 21.79796f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(21.79796f, 11.0f),
                    PathNode.CurveTo(20.883366f, 8.759704f, 17.04589f, 7.115041f, 12.478135f, 7.005715f),
                    PathNode.CurveTo(7.910381f, 6.896389f, 3.776261f, 8.350259f, 2.437873f, 10.536633f),
                    PathNode.CurveTo(1.099485f, 12.723005f, 2.897864f, 15.08477f, 6.805477f, 16.272493f),
                    PathNode.CurveTo(10.713091f, 17.460217f, 15.734236f, 17.171255f, 19.0f, 15.57071f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _rotate3D!!
    }

private var _rotate3D: ImageVector? = null
