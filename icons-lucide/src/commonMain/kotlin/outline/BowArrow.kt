package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.BowArrow: ImageVector
    get() {
        if (_bowArrow != null) return _bowArrow!!
        _bowArrow = lucideOutlineIcon(
            name = "BowArrow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.0f, 3.0f),
                    PathNode.LineTo(21.0f, 3.0f),
                    PathNode.LineTo(21.0f, 7.0f)
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
                    PathNode.MoveTo(18.575f, 11.082f),
                    PathNode.CurveTo(19.998924f, 13.86694f, 20.371008f, 17.071909f, 19.623f, 20.109f),
                    PathNode.CurveTo(19.525684f, 20.507725f, 19.226559f, 20.826302f, 18.834747f, 20.948511f),
                    PathNode.CurveTo(18.442938f, 21.070723f, 18.01574f, 20.978695f, 17.709f, 20.706f),
                    PathNode.LineTo(14.0f, 17.0f)
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
                    PathNode.MoveTo(7.0f, 10.0f),
                    PathNode.LineTo(3.29f, 6.29f),
                    PathNode.CurveTo(3.019337f, 5.982809f, 2.928939f, 5.556484f, 3.05164f, 5.165882f),
                    PathNode.CurveTo(3.174343f, 4.775281f, 3.492293f, 4.477233f, 3.89f, 4.38f),
                    PathNode.CurveTo(6.928275f, 3.631858f, 10.134454f, 4.004669f, 12.92f, 5.43f)
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
                    PathNode.MoveTo(7.0f, 14.0f),
                    PathNode.CurveTo(6.547128f, 13.999244f, 6.112674f, 14.179216f, 5.793f, 14.5f),
                    PathNode.LineTo(3.147f, 17.146f),
                    PathNode.CurveTo(3.003753f, 17.288885f, 2.960736f, 17.504019f, 3.038026f, 17.691f),
                    PathNode.CurveTo(3.115315f, 17.877983f, 3.297673f, 17.999956f, 3.5f, 18.0f),
                    PathNode.LineTo(5.0f, 18.0f),
                    PathNode.CurveTo(5.552285f, 18.0f, 6.0f, 18.447716f, 6.0f, 19.0f),
                    PathNode.LineTo(6.0f, 20.5f),
                    PathNode.CurveTo(5.999638f, 20.702509f, 6.121463f, 20.885239f, 6.308537f, 20.962784f),
                    PathNode.CurveTo(6.495611f, 21.04033f, 6.710986f, 20.997377f, 6.854f, 20.854f),
                    PathNode.LineTo(9.5f, 18.207f),
                    PathNode.CurveTo(9.820784f, 17.887325f, 10.000756f, 17.452871f, 10.0f, 17.0f),
                    PathNode.LineTo(10.0f, 15.0f),
                    PathNode.CurveTo(10.0f, 14.447715f, 9.552285f, 14.0f, 9.0f, 14.0f),
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
                    PathNode.MoveTo(9.707f, 14.293f),
                    PathNode.LineTo(21.0f, 3.0f)
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
        return _bowArrow!!
    }

private var _bowArrow: ImageVector? = null
