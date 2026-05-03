package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.PenOff: ImageVector
    get() {
        if (_penOff != null) return _penOff!!
        _penOff = lucideOutlineIcon(
            name = "PenOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.0f, 10.0f),
                    PathNode.LineTo(3.843f, 16.162f),
                    PathNode.CurveTo(3.610401f, 16.39435f, 3.438667f, 16.680458f, 3.343f, 16.995f),
                    PathNode.LineTo(2.021f, 21.355f),
                    PathNode.CurveTo(1.96758f, 21.531244f, 2.015369f, 21.722588f, 2.145383f, 21.85302f),
                    PathNode.CurveTo(2.275396f, 21.98345f, 2.466585f, 22.031853f, 2.643f, 21.979f),
                    PathNode.LineTo(7.001f, 20.656f),
                    PathNode.CurveTo(7.314469f, 20.559887f, 7.5995f, 20.38818f, 7.831f, 20.156f),
                    PathNode.LineTo(14.0f, 13.982f)
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
                    PathNode.MoveTo(12.829f, 7.172f),
                    PathNode.LineTo(17.188f, 2.826f),
                    PathNode.CurveTo(18.288704f, 1.725297f, 20.073296f, 1.725297f, 21.174f, 2.826f),
                    PathNode.CurveTo(22.274704f, 3.926704f, 22.274704f, 5.711297f, 21.174f, 6.812f),
                    PathNode.LineTo(16.821f, 11.165f)
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
                    PathNode.MoveTo(2.0f, 2.0f),
                    PathNode.LineTo(22.0f, 22.0f)
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
        return _penOff!!
    }

private var _penOff: ImageVector? = null
