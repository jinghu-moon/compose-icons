package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandNeteaseMusic: ImageVector
    get() {
        if (_brandNeteaseMusic != null) return _brandNeteaseMusic!!
        _brandNeteaseMusic = tablerOutlineIcon(
            name = "BrandNeteaseMusic",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(9.0f, 4.0f),
                    PathNode.CurveTo(6.07f, 5.346f, 4.0f, 9.046f, 4.0f, 12.492f),
                    PathNode.CurveTo(4.0f, 17.0f, 8.0f, 20.0f, 12.0f, 20.0f),
                    PathNode.CurveTo(16.0f, 20.0f, 20.0f, 17.0f, 20.0f, 13.0f),
                    PathNode.CurveTo(20.0f, 9.487f, 16.5f, 7.487f, 14.0f, 7.487f),
                    PathNode.CurveTo(11.5f, 7.487f, 9.0f, 9.0f, 9.0f, 12.0f),
                    PathNode.CurveTo(9.0f, 14.0f, 10.5f, 15.0f, 12.0f, 15.0f),
                    PathNode.CurveTo(13.5f, 15.0f, 15.0f, 14.0f, 15.0f, 12.0f),
                    PathNode.CurveTo(15.0f, 8.487f, 13.0f, 7.492f, 13.0f, 5.485f),
                    PathNode.CurveTo(13.0f, 1.981f, 16.5f, 2.882f, 17.0f, 3.983f)
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
        return _brandNeteaseMusic!!
    }

private var _brandNeteaseMusic: ImageVector? = null
