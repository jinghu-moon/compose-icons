package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.HatGlasses: ImageVector
    get() {
        if (_hatGlasses != null) return _hatGlasses!!
        _hatGlasses = lucideOutlineIcon(
            name = "HatGlasses",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(14.0f, 18.0f),
                    PathNode.CurveTo(14.0f, 16.89543f, 13.104569f, 16.0f, 12.0f, 16.0f),
                    PathNode.CurveTo(10.895431f, 16.0f, 10.0f, 16.89543f, 10.0f, 18.0f)
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
                    PathNode.MoveTo(19.0f, 11.0f),
                    PathNode.LineTo(16.89f, 4.343f),
                    PathNode.CurveTo(16.703194f, 3.80529f, 16.296112f, 3.372657f, 15.770755f, 3.153503f),
                    PathNode.CurveTo(15.245398f, 2.93435f, 14.651546f, 2.949443f, 14.138f, 3.195f),
                    PathNode.LineTo(12.862f, 3.805f),
                    PathNode.CurveTo(12.592803f, 3.933466f, 12.29828f, 4.000093f, 12.0f, 4.0f),
                    PathNode.LineTo(8.5f, 4.0f),
                    PathNode.CurveTo(7.604791f, 3.999819f, 6.818497f, 4.594543f, 6.575f, 5.456f),
                    PathNode.LineTo(5.0f, 11.0f)
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
                    PathNode.MoveTo(2.0f, 11.0f),
                    PathNode.LineTo(22.0f, 11.0f)
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
                    PathNode.MoveTo(20.0f, 18.0f),
                    PathNode.CurveTo(20.0f, 19.656855f, 18.656855f, 21.0f, 17.0f, 21.0f),
                    PathNode.CurveTo(15.343145f, 21.0f, 14.0f, 19.656855f, 14.0f, 18.0f),
                    PathNode.CurveTo(14.0f, 16.343145f, 15.343145f, 15.0f, 17.0f, 15.0f),
                    PathNode.CurveTo(18.656855f, 15.0f, 20.0f, 16.343145f, 20.0f, 18.0f),
                    PathNode.Close
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
                    PathNode.MoveTo(10.0f, 18.0f),
                    PathNode.CurveTo(10.0f, 19.656855f, 8.656855f, 21.0f, 7.0f, 21.0f),
                    PathNode.CurveTo(5.343146f, 21.0f, 4.0f, 19.656855f, 4.0f, 18.0f),
                    PathNode.CurveTo(4.0f, 16.343145f, 5.343146f, 15.0f, 7.0f, 15.0f),
                    PathNode.CurveTo(8.656855f, 15.0f, 10.0f, 16.343145f, 10.0f, 18.0f),
                    PathNode.Close
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
        return _hatGlasses!!
    }

private var _hatGlasses: ImageVector? = null
