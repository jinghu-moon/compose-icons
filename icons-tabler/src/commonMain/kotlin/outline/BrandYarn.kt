package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandYarn: ImageVector
    get() {
        if (_brandYarn != null) return _brandYarn!!
        _brandYarn = tablerOutlineIcon(
            name = "BrandYarn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.845f, 19.308f),
                    PathNode.CurveTo(16.577f, 20.122f, 15.435f, 20.562f, 14.0f, 21.0f),
                    PathNode.CurveTo(13.824f, 21.21f, 13.355f, 21.544f, 13.088f, 21.588f),
                    PathNode.CurveTo(11.597036f, 21.805023f, 10.09558f, 21.942553f, 8.59f, 22.0f),
                    PathNode.CurveTo(7.778f, 22.006f, 7.28f, 21.786f, 7.143f, 21.446f),
                    PathNode.CurveTo(7.028f, 21.167f, 7.479f, 19.392f, 7.441f, 19.482f),
                    PathNode.CurveTo(7.284f, 19.874f, 6.866f, 20.769f, 6.444f, 21.202f),
                    PathNode.CurveTo(5.865f, 21.802f, 4.77f, 21.602f, 4.122f, 21.253f),
                    PathNode.CurveTo(3.412f, 20.867f, 4.052f, 19.973f, 3.776f, 19.986f),
                    PathNode.CurveTo(3.5f, 20.0f, 3.0f, 18.5f, 3.0f, 17.75f),
                    PathNode.CurveTo(3.0f, 16.922f, 3.622f, 16.076f, 4.235f, 15.539f),
                    PathNode.CurveTo(4.138473f, 14.469721f, 4.296092f, 13.392769f, 4.695f, 12.396f),
                    PathNode.CurveTo(5.216982f, 11.364059f, 5.973127f, 10.468534f, 6.903f, 9.781f),
                    PathNode.CurveTo(6.903f, 9.781f, 5.55f, 8.247f, 6.054f, 6.869f),
                    PathNode.CurveTo(6.382f, 5.967f, 6.514f, 5.974f, 6.621f, 5.934f),
                    PathNode.CurveTo(7.001f, 5.814f, 7.348f, 5.604f, 7.634f, 5.322f),
                    PathNode.CurveTo(8.414f, 4.442f, 9.594f, 3.884f, 10.75f, 4.0f),
                    PathNode.CurveTo(10.75f, 4.0f, 11.531f, 1.57f, 12.283f, 2.064f),
                    PathNode.CurveTo(12.698f, 2.717f, 12.954f, 3.282f, 13.25f, 4.0f),
                    PathNode.CurveTo(13.25f, 4.0f, 14.4f, 3.3f, 14.5f, 3.5f),
                    PathNode.CurveTo(15.014f, 4.898f, 14.987f, 6.704f, 14.711f, 8.17f),
                    PathNode.CurveTo(14.387f, 9.578f, 13.871f, 10.861f, 13.0f, 12.0f),
                    PathNode.CurveTo(12.906f, 12.16f, 13.98f, 12.705f, 14.722f, 14.812f),
                    PathNode.CurveTo(15.408f, 16.74f, 15.0f, 17.25f, 15.0f, 17.5f),
                    PathNode.CurveTo(15.0f, 17.75f, 15.716f, 17.644f, 17.296f, 16.645f),
                    PathNode.CurveTo(18.16505f, 15.993654f, 19.198309f, 15.597179f, 20.28f, 15.5f),
                    PathNode.CurveTo(21.015f, 15.434f, 21.268f, 15.465f, 21.5f, 16.5f),
                    PathNode.CurveTo(21.732f, 17.535f, 21.154f, 17.906f, 20.756f, 18.006f),
                    PathNode.CurveTo(20.756f, 18.006f, 18.666f, 18.681f, 17.845f, 19.308f)
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
        return _brandYarn!!
    }

private var _brandYarn: ImageVector? = null
