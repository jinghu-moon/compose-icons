package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ArrowBigUpDash: ImageVector
    get() {
        if (_arrowBigUpDash != null) return _arrowBigUpDash!!
        _arrowBigUpDash = lucideOutlineIcon(
            name = "ArrowBigUpDash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(14.0f, 16.0f),
                    PathNode.CurveTo(14.552285f, 16.0f, 15.0f, 15.552285f, 15.0f, 15.0f),
                    PathNode.LineTo(15.0f, 13.0f),
                    PathNode.CurveTo(15.0f, 12.447715f, 15.447715f, 12.0f, 16.0f, 12.0f),
                    PathNode.LineTo(19.293f, 12.0f),
                    PathNode.CurveTo(19.579002f, 12.000061f, 19.836868f, 11.827806f, 19.946325f, 11.563578f),
                    PathNode.CurveTo(20.055782f, 11.29935f, 19.995264f, 10.995203f, 19.793f, 10.793f),
                    PathNode.LineTo(12.854f, 3.854f),
                    PathNode.CurveTo(12.627602f, 3.627324f, 12.320373f, 3.499956f, 12.0f, 3.499956f),
                    PathNode.CurveTo(11.679627f, 3.499956f, 11.372398f, 3.627324f, 11.146f, 3.854f),
                    PathNode.LineTo(4.206f, 10.794f),
                    PathNode.CurveTo(4.004449f, 10.996296f, 3.944386f, 11.299979f, 4.053752f, 11.563769f),
                    PathNode.CurveTo(4.163118f, 11.82756f, 4.420437f, 11.999658f, 4.706f, 12.0f),
                    PathNode.LineTo(8.0f, 12.0f),
                    PathNode.CurveTo(8.552285f, 12.0f, 9.0f, 12.447715f, 9.0f, 13.0f),
                    PathNode.LineTo(9.0f, 15.0f),
                    PathNode.CurveTo(9.0f, 15.552285f, 9.447715f, 16.0f, 10.0f, 16.0f),
                    PathNode.Close
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
                    PathNode.MoveTo(9.0f, 20.0f),
                    PathNode.LineTo(15.0f, 20.0f)
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
        return _arrowBigUpDash!!
    }

private var _arrowBigUpDash: ImageVector? = null
