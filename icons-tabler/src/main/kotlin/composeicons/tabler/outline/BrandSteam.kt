package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandSteam: ImageVector
    get() {
        if (_brandSteam != null) return _brandSteam!!
        _brandSteam = tablerOutlineIcon(
            name = "BrandSteam",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(16.5f, 5.0f),
                    PathNode.CurveTo(18.18495f, 5.001621f, 19.72782f, 5.944402f, 20.498022f, 7.443017f),
                    PathNode.CurveTo(21.268225f, 8.941631f, 21.136696f, 10.744958f, 20.157196f, 12.115955f),
                    PathNode.CurveTo(19.177694f, 13.486953f, 17.514353f, 14.195884f, 15.847f, 13.953f),
                    PathNode.LineTo(11.5f, 16.962f),
                    PathNode.LineTo(11.5f, 17.0f),
                    PathNode.CurveTo(11.502739f, 18.590487f, 10.26375f, 19.906694f, 8.676f, 20.0f),
                    PathNode.LineTo(8.5f, 20.0f),
                    PathNode.CurveTo(7.073581f, 20.000097f, 5.844333f, 18.995794f, 5.56f, 17.598f),
                    PathNode.LineTo(3.0f, 16.5f),
                    PathNode.LineTo(3.0f, 13.0f),
                    PathNode.LineTo(6.51f, 14.755f),
                    PathNode.CurveTo(7.281437f, 14.067771f, 8.353075f, 13.827655f, 9.344f, 14.12f),
                    PathNode.LineTo(12.071f, 10.302f),
                    PathNode.CurveTo(11.83325f, 8.98935f, 12.190154f, 7.638871f, 13.04538f, 6.615072f),
                    PathNode.CurveTo(13.900605f, 5.591273f, 15.165993f, 4.999691f, 16.5f, 5.0f)
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
                    PathNode.MoveTo(15.5f, 9.5f),
                    PathNode.CurveTo(15.5f, 10.052285f, 15.947715f, 10.5f, 16.5f, 10.5f),
                    PathNode.CurveTo(17.052284f, 10.5f, 17.5f, 10.052285f, 17.5f, 9.5f),
                    PathNode.CurveTo(17.5f, 8.947715f, 17.052284f, 8.5f, 16.5f, 8.5f),
                    PathNode.CurveTo(15.947715f, 8.5f, 15.5f, 8.947715f, 15.5f, 9.5f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _brandSteam!!
    }

private var _brandSteam: ImageVector? = null
