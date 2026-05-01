package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.MousePointerClick: ImageVector
    get() {
        if (_mousePointerClick != null) return _mousePointerClick!!
        _mousePointerClick = lucideOutlineIcon(
            name = "MousePointerClick",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(14.0f, 4.1f),
                    PathNode.LineTo(12.0f, 6.0f)
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
                    PathNode.MoveTo(5.1f, 8.0f),
                    PathNode.LineTo(2.2f, 7.2f)
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
                    PathNode.MoveTo(6.0f, 12.0f),
                    PathNode.LineTo(4.1f, 14.0f)
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
                    PathNode.MoveTo(7.2f, 2.2f),
                    PathNode.LineTo(8.0f, 5.1f)
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
                    PathNode.MoveTo(9.037f, 9.69f),
                    PathNode.CurveTo(8.957675f, 9.503131f, 8.999721f, 9.286818f, 9.143269f, 9.143269f),
                    PathNode.CurveTo(9.286818f, 8.999721f, 9.503131f, 8.957675f, 9.69f, 9.037f),
                    PathNode.LineTo(20.69f, 13.537f),
                    PathNode.CurveTo(20.890862f, 13.619401f, 21.015594f, 13.822008f, 20.998716f, 14.038458f),
                    PathNode.CurveTo(20.981838f, 14.254908f, 20.827208f, 14.435731f, 20.616f, 14.486f),
                    PathNode.LineTo(16.267f, 15.527f),
                    PathNode.CurveTo(15.900916f, 15.614443f, 15.614938f, 15.900034f, 15.527f, 16.266f),
                    PathNode.LineTo(14.487f, 20.616f),
                    PathNode.CurveTo(14.437266f, 20.827953f, 14.256103f, 20.983364f, 14.03905f, 21.00027f),
                    PathNode.CurveTo(13.821999f, 21.017178f, 13.618955f, 20.891697f, 13.537f, 20.69f),
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
        }
        return _mousePointerClick!!
    }

private var _mousePointerClick: ImageVector? = null
