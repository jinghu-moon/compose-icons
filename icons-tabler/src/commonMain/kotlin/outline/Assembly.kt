package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Assembly: ImageVector
    get() {
        if (_assembly != null) return _assembly!!
        _assembly = tablerOutlineIcon(
            name = "Assembly",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(19.875f, 6.27f),
                    PathNode.CurveTo(20.575f, 6.668f, 21.005f, 7.413f, 21.0f, 8.218001f),
                    PathNode.LineTo(21.0f, 15.502f),
                    PathNode.CurveTo(21.0f, 16.311f, 20.557f, 17.057f, 19.842f, 17.45f),
                    PathNode.LineTo(13.092f, 21.72f),
                    PathNode.CurveTo(12.411835f, 22.093222f, 11.588165f, 22.093222f, 10.908f, 21.72f),
                    PathNode.LineTo(4.158f, 17.45f),
                    PathNode.CurveTo(3.446241f, 17.059809f, 3.002708f, 16.313692f, 3.0f, 15.502f),
                    PathNode.LineTo(3.0f, 8.217f),
                    PathNode.CurveTo(3.0f, 7.408f, 3.443f, 6.663f, 4.158f, 6.27f),
                    PathNode.LineTo(10.908f, 2.29f),
                    PathNode.CurveTo(11.608304f, 1.903881f, 12.457696f, 1.903881f, 13.158f, 2.29f),
                    PathNode.LineTo(19.908f, 6.27f),
                    PathNode.LineTo(19.875f, 6.27f)
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
                    PathNode.MoveTo(15.5f, 9.422f),
                    PathNode.CurveTo(15.812f, 9.602f, 16.003f, 9.937f, 16.0f, 10.298f),
                    PathNode.LineTo(16.0f, 13.575f),
                    PathNode.CurveTo(16.0f, 13.939f, 15.803f, 14.275f, 15.485f, 14.452f),
                    PathNode.LineTo(12.485f, 16.374f),
                    PathNode.CurveTo(12.183311f, 16.541315f, 11.816689f, 16.541315f, 11.515f, 16.374f),
                    PathNode.LineTo(8.515f, 14.452f),
                    PathNode.CurveTo(8.196709f, 14.275478f, 7.99946f, 13.939962f, 8.0f, 13.576f),
                    PathNode.LineTo(8.0f, 10.298f),
                    PathNode.CurveTo(8.0f, 9.934f, 8.197f, 9.598f, 8.514f, 9.421f),
                    PathNode.LineTo(11.514f, 7.631f),
                    PathNode.CurveTo(11.825f, 7.457f, 12.204f, 7.457f, 12.514f, 7.631f),
                    PathNode.LineTo(15.514f, 9.421f),
                    PathNode.LineTo(15.5f, 9.421f),
                    PathNode.LineTo(15.5f, 9.422f)
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
        return _assembly!!
    }

private var _assembly: ImageVector? = null
