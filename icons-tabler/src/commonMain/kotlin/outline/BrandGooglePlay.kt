package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandGooglePlay: ImageVector
    get() {
        if (_brandGooglePlay != null) return _brandGooglePlay!!
        _brandGooglePlay = tablerOutlineIcon(
            name = "BrandGooglePlay",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.0f, 3.71f),
                    PathNode.LineTo(4.0f, 20.29f),
                    PathNode.CurveTo(4.000078f, 20.540047f, 4.133528f, 20.771065f, 4.350095f, 20.896055f),
                    PathNode.CurveTo(4.566661f, 21.021044f, 4.833453f, 21.021023f, 5.05f, 20.896f),
                    PathNode.LineTo(19.672f, 12.476f),
                    PathNode.CurveTo(19.842352f, 12.377801f, 19.947323f, 12.196129f, 19.947323f, 11.9995f),
                    PathNode.CurveTo(19.947323f, 11.802871f, 19.842352f, 11.6212f, 19.672f, 11.523f),
                    PathNode.LineTo(5.05f, 3.104f),
                    PathNode.CurveTo(4.833298f, 2.978887f, 4.566293f, 2.978962f, 4.349661f, 3.104195f),
                    PathNode.CurveTo(4.133029f, 3.229429f, 3.99972f, 3.460775f, 4.0f, 3.711f),
                    PathNode.LineTo(4.0f, 3.71f)
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
                    PathNode.MoveTo(15.0f, 9.0f),
                    PathNode.LineTo(4.5f, 20.5f)
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
                    PathNode.MoveTo(4.5f, 3.5f),
                    PathNode.LineTo(15.0f, 15.0f)
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
        return _brandGooglePlay!!
    }

private var _brandGooglePlay: ImageVector? = null
