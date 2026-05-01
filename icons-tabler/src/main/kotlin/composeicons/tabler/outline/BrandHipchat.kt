package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandHipchat: ImageVector
    get() {
        if (_brandHipchat != null) return _brandHipchat!!
        _brandHipchat = tablerOutlineIcon(
            name = "BrandHipchat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.802f, 17.292f),
                    PathNode.CurveTo(17.802f, 17.292f, 17.879f, 17.237f, 18.002f, 17.143f),
                    PathNode.CurveTo(19.845f, 15.718f, 21.002f, 13.653f, 21.002f, 11.354f),
                    PathNode.CurveTo(21.002f, 7.068f, 16.972f, 3.59f, 12.002f, 3.59f),
                    PathNode.CurveTo(7.032f, 3.59f, 3.002f, 7.068f, 3.002f, 11.354f),
                    PathNode.CurveTo(3.002f, 15.642f, 7.032f, 19.0f, 12.002f, 19.0f),
                    PathNode.CurveTo(12.426f, 19.0f, 13.122f, 18.972f, 14.09f, 18.916f),
                    PathNode.CurveTo(15.352f, 19.736f, 17.194f, 20.409f, 18.806f, 20.409f),
                    PathNode.CurveTo(19.305f, 20.409f, 19.54f, 19.999f, 19.22f, 19.581f),
                    PathNode.CurveTo(18.734f, 18.985f, 18.064f, 18.03f, 17.804f, 17.291f),
                    PathNode.LineTo(17.802f, 17.292f)
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
                    PathNode.MoveTo(7.5f, 13.5f),
                    PathNode.CurveTo(10.0f, 16.0f, 14.0f, 16.0f, 16.5f, 13.5f)
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
        return _brandHipchat!!
    }

private var _brandHipchat: ImageVector? = null
