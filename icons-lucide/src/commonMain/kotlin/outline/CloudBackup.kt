package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.CloudBackup: ImageVector
    get() {
        if (_cloudBackup != null) return _cloudBackup!!
        _cloudBackup = lucideOutlineIcon(
            name = "CloudBackup",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(21.0f, 15.251f),
                    PathNode.CurveTo(22.04257f, 13.901711f, 22.232956f, 12.079052f, 21.491726f, 10.543436f),
                    PathNode.CurveTo(20.750498f, 9.007821f, 19.204994f, 8.023062f, 17.5f, 8.0f),
                    PathNode.LineTo(15.71f, 8.0f),
                    PathNode.CurveTo(14.932446f, 5.404519f, 12.726898f, 3.490841f, 10.04771f, 3.087029f),
                    PathNode.CurveTo(7.368522f, 2.683217f, 4.696903f, 3.861798f, 3.188879f, 6.112794f),
                    PathNode.CurveTo(1.680856f, 8.363789f, 1.607285f, 11.282897f, 3.0f, 13.607f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(7.0f, 11.0f),
                    PathNode.LineTo(7.0f, 15.0f),
                    PathNode.LineTo(11.0f, 15.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(8.0f, 19.0f),
                    PathNode.CurveTo(9.291291f, 20.721722f, 11.539428f, 21.423986f, 13.581139f, 20.743416f),
                    PathNode.CurveTo(15.622849f, 20.062847f, 17.0f, 18.152151f, 17.0f, 16.0f),
                    PathNode.CurveTo(17.0f, 13.514719f, 14.985281f, 11.5f, 12.5f, 11.5f),
                    PathNode.CurveTo(11.221302f, 11.499074f, 9.994638f, 12.006287f, 9.09f, 12.91f),
                    PathNode.LineTo(7.0f, 15.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _cloudBackup!!
    }

private var _cloudBackup: ImageVector? = null
