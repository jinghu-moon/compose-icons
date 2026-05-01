package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Paperclip: ImageVector
    get() {
        if (_paperclip != null) return _paperclip!!
        _paperclip = lucideOutlineIcon(
            name = "Paperclip",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(16.0f, 6.0f),
                    PathNode.LineTo(7.586f, 14.586f),
                    PathNode.CurveTo(6.804794f, 15.367207f, 6.804794f, 16.633793f, 7.586f, 17.415f),
                    PathNode.CurveTo(8.367207f, 18.196207f, 9.633793f, 18.196207f, 10.415f, 17.415f),
                    PathNode.LineTo(18.829f, 8.829f),
                    PathNode.CurveTo(20.391138f, 7.266863f, 20.391138f, 4.734138f, 18.829f, 3.172f),
                    PathNode.CurveTo(17.266863f, 1.609863f, 14.734138f, 1.609863f, 13.172f, 3.172f),
                    PathNode.LineTo(4.793f, 11.723f),
                    PathNode.CurveTo(3.256658f, 13.234521f, 2.649037f, 15.453922f, 3.2012f, 17.537228f),
                    PathNode.CurveTo(3.753363f, 19.620531f, 5.380469f, 21.247637f, 7.463774f, 21.799797f),
                    PathNode.CurveTo(9.547078f, 22.351965f, 11.766479f, 21.744343f, 13.278f, 20.208f),
                    PathNode.LineTo(21.657f, 11.657f)
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
        return _paperclip!!
    }

private var _paperclip: ImageVector? = null
