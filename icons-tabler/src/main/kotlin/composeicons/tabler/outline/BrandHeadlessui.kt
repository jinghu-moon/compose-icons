package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandHeadlessui: ImageVector
    get() {
        if (_brandHeadlessui != null) return _brandHeadlessui!!
        _brandHeadlessui = tablerOutlineIcon(
            name = "BrandHeadlessui",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(6.744f, 4.325f),
                    PathNode.LineTo(14.564f, 3.058f),
                    PathNode.CurveTo(16.993202f, 2.664594f, 19.281412f, 4.314828f, 19.675f, 6.744f),
                    PathNode.LineTo(20.942f, 14.564f),
                    PathNode.CurveTo(21.335407f, 16.993202f, 19.685175f, 19.281412f, 17.256f, 19.675f),
                    PathNode.LineTo(9.436f, 20.942f),
                    PathNode.CurveTo(7.006799f, 21.335407f, 4.718588f, 19.685175f, 4.325f, 17.256f),
                    PathNode.LineTo(3.058f, 9.436f),
                    PathNode.CurveTo(2.664594f, 7.006799f, 4.314828f, 4.718588f, 6.744f, 4.325f)
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
                    PathNode.MoveTo(7.252f, 7.704f),
                    PathNode.LineTo(15.149f, 6.424f),
                    PathNode.CurveTo(15.410913f, 6.381616f, 15.678933f, 6.445054f, 15.894056f, 6.600349f),
                    PathNode.CurveTo(16.10918f, 6.755643f, 16.253773f, 6.990062f, 16.296f, 7.252f),
                    PathNode.LineTo(16.656f, 9.475f),
                    PathNode.LineTo(7.094f, 12.985f),
                    PathNode.LineTo(6.424f, 8.851f),
                    PathNode.CurveTo(6.381616f, 8.589087f, 6.445054f, 8.321067f, 6.600349f, 8.105944f),
                    PathNode.CurveTo(6.755643f, 7.89082f, 6.990062f, 7.746228f, 7.252f, 7.704f)
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
        return _brandHeadlessui!!
    }

private var _brandHeadlessui: ImageVector? = null
