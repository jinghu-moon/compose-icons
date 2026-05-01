package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Droplets: ImageVector
    get() {
        if (_droplets != null) return _droplets!!
        _droplets = tablerOutlineIcon(
            name = "Droplets",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.072f, 20.3f),
                    PathNode.CurveTo(5.186995f, 21.235823f, 6.813005f, 21.235823f, 7.928f, 20.3f),
                    PathNode.CurveTo(9.042546f, 19.36384f, 9.324945f, 17.763016f, 8.598f, 16.502f),
                    PathNode.LineTo(6.503f, 13.275f),
                    PathNode.CurveTo(6.392228f, 13.105225f, 6.203218f, 13.002862f, 6.0005f, 13.002862f),
                    PathNode.CurveTo(5.797783f, 13.002862f, 5.608773f, 13.105225f, 5.498f, 13.275f),
                    PathNode.LineTo(3.4f, 16.502f),
                    PathNode.CurveTo(2.673712f, 17.763323f, 2.956488f, 19.363895f, 4.071f, 20.3f)
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
                    PathNode.MoveTo(16.072f, 20.3f),
                    PathNode.CurveTo(17.186995f, 21.235823f, 18.813005f, 21.235823f, 19.928f, 20.3f),
                    PathNode.CurveTo(21.042547f, 19.36384f, 21.324945f, 17.763016f, 20.598f, 16.502f),
                    PathNode.LineTo(18.503f, 13.275f),
                    PathNode.CurveTo(18.392227f, 13.105225f, 18.203217f, 13.002862f, 18.0005f, 13.002862f),
                    PathNode.CurveTo(17.797783f, 13.002862f, 17.608772f, 13.105225f, 17.498f, 13.275f),
                    PathNode.LineTo(15.4f, 16.502f),
                    PathNode.CurveTo(14.673712f, 17.763323f, 14.956488f, 19.363895f, 16.071f, 20.3f)
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
                    PathNode.MoveTo(10.072f, 10.3f),
                    PathNode.CurveTo(11.186996f, 11.235824f, 12.813004f, 11.235824f, 13.928f, 10.3f),
                    PathNode.CurveTo(15.042546f, 9.363839f, 15.324945f, 7.763016f, 14.598f, 6.502f),
                    PathNode.LineTo(12.503f, 3.275f),
                    PathNode.CurveTo(12.392228f, 3.105224f, 12.203218f, 3.002863f, 12.0005f, 3.002863f),
                    PathNode.CurveTo(11.797783f, 3.002863f, 11.608772f, 3.105224f, 11.498f, 3.275f),
                    PathNode.LineTo(9.4f, 6.502f),
                    PathNode.CurveTo(8.673712f, 7.763323f, 8.956488f, 9.363894f, 10.071f, 10.3f),
                    PathNode.LineTo(10.072f, 10.3f)
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
        return _droplets!!
    }

private var _droplets: ImageVector? = null
