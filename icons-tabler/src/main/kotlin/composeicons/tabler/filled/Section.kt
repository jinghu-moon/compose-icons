package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Section: ImageVector
    get() {
        if (_section != null) return _section!!
        _section = tablerFilledIcon(
            name = "Section",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(20.01f, 19.0f),
                    PathNode.CurveTo(20.539095f, 19.000587f, 20.976164f, 19.41321f, 21.007172f, 19.941395f),
                    PathNode.CurveTo(21.03818f, 20.46958f, 20.65239f, 20.93051f, 20.127f, 20.993f),
                    PathNode.LineTo(20.0f, 21.0f),
                    PathNode.CurveTo(19.470907f, 20.999413f, 19.033834f, 20.58679f, 19.002829f, 20.058605f),
                    PathNode.CurveTo(18.97182f, 19.53042f, 19.357609f, 19.06949f, 19.883f, 19.007f),
                    PathNode.Close,
                    PathNode.MoveTo(4.01f, 19.0f),
                    PathNode.CurveTo(4.562285f, 19.0f, 5.01f, 19.447716f, 5.01f, 20.0f),
                    PathNode.CurveTo(5.01f, 20.552284f, 4.562285f, 21.0f, 4.01f, 21.0f),
                    PathNode.CurveTo(3.478861f, 21.004911f, 3.036557f, 20.593723f, 3.002779f, 20.063637f),
                    PathNode.CurveTo(2.969f, 19.53355f, 3.355534f, 19.069546f, 3.883f, 19.007f),
                    PathNode.MoveTo(7.883f, 19.007f),
                    PathNode.CurveTo(8.435285f, 19.007f, 8.883f, 19.454716f, 8.883f, 20.007f),
                    PathNode.CurveTo(8.883f, 20.559284f, 8.435285f, 21.007f, 7.883f, 21.007f),
                    PathNode.CurveTo(7.351862f, 21.011911f, 6.909558f, 20.600723f, 6.875779f, 20.070637f),
                    PathNode.CurveTo(6.842f, 19.54055f, 7.228534f, 19.076546f, 7.756f, 19.014f),
                    PathNode.MoveTo(11.756f, 19.014f),
                    PathNode.CurveTo(12.285093f, 19.014587f, 12.722165f, 19.42721f, 12.753172f, 19.955395f),
                    PathNode.CurveTo(12.78418f, 20.48358f, 12.398391f, 20.94451f, 11.873f, 21.007f),
                    PathNode.LineTo(11.746f, 21.014f),
                    PathNode.CurveTo(11.216907f, 21.013412f, 10.779835f, 20.60079f, 10.748828f, 20.072605f),
                    PathNode.CurveTo(10.71782f, 19.54442f, 11.10361f, 19.08349f, 11.629f, 19.021f),
                    PathNode.Close,
                    PathNode.MoveTo(15.756f, 19.014f),
                    PathNode.CurveTo(16.285093f, 19.014587f, 16.722164f, 19.42721f, 16.753172f, 19.955395f),
                    PathNode.CurveTo(16.78418f, 20.48358f, 16.39839f, 20.94451f, 15.873f, 21.007f),
                    PathNode.LineTo(15.746f, 21.014f),
                    PathNode.CurveTo(15.216907f, 21.013412f, 14.779835f, 20.60079f, 14.748828f, 20.072605f),
                    PathNode.CurveTo(14.71782f, 19.54442f, 15.10361f, 19.08349f, 15.629f, 19.021f),
                    PathNode.Close,
                    PathNode.MoveTo(19.756f, 3.014f),
                    PathNode.CurveTo(20.285093f, 3.014587f, 20.722164f, 3.427211f, 20.753172f, 3.955395f),
                    PathNode.CurveTo(20.78418f, 4.483579f, 20.39839f, 4.944509f, 19.873f, 5.007f),
                    PathNode.LineTo(19.746f, 5.014f),
                    PathNode.CurveTo(19.216908f, 5.013413f, 18.779835f, 4.60079f, 18.748825f, 4.072605f),
                    PathNode.CurveTo(18.717821f, 3.544421f, 19.10361f, 3.083491f, 19.629f, 3.021f),
                    PathNode.Close,
                    PathNode.MoveTo(3.756f, 3.014f),
                    PathNode.CurveTo(4.308285f, 3.014f, 4.756f, 3.461715f, 4.756f, 4.014f),
                    PathNode.CurveTo(4.756f, 4.566285f, 4.308285f, 5.014f, 3.756f, 5.014f),
                    PathNode.CurveTo(3.224862f, 5.018911f, 2.782557f, 4.607723f, 2.748779f, 4.077637f),
                    PathNode.CurveTo(2.715f, 3.547551f, 3.101534f, 3.083547f, 3.629f, 3.021f),
                    PathNode.MoveTo(7.629f, 3.021f),
                    PathNode.CurveTo(8.181285f, 3.021f, 8.629f, 3.468715f, 8.629f, 4.021f),
                    PathNode.CurveTo(8.629f, 4.573285f, 8.181285f, 5.021f, 7.629f, 5.021f),
                    PathNode.CurveTo(7.097862f, 5.025911f, 6.655557f, 4.614723f, 6.621779f, 4.084637f),
                    PathNode.CurveTo(6.588f, 3.554551f, 6.974534f, 3.090547f, 7.502f, 3.028f),
                    PathNode.MoveTo(11.502f, 3.028f),
                    PathNode.CurveTo(12.031094f, 3.028587f, 12.468164f, 3.441211f, 12.499172f, 3.969395f),
                    PathNode.CurveTo(12.530179f, 4.497579f, 12.14439f, 4.958509f, 11.619f, 5.021f),
                    PathNode.LineTo(11.492f, 5.028f),
                    PathNode.CurveTo(10.962907f, 5.027414f, 10.525835f, 4.61479f, 10.494828f, 4.086605f),
                    PathNode.CurveTo(10.46382f, 3.558421f, 10.849609f, 3.097491f, 11.375f, 3.035f),
                    PathNode.Close,
                    PathNode.MoveTo(15.492f, 3.028f),
                    PathNode.CurveTo(16.044285f, 3.028f, 16.492f, 3.475715f, 16.492f, 4.028f),
                    PathNode.CurveTo(16.49476f, 4.580285f, 16.049284f, 5.030239f, 15.497f, 5.033f),
                    PathNode.CurveTo(14.944715f, 5.035762f, 14.494761f, 4.590285f, 14.492f, 4.038f),
                    PathNode.CurveTo(14.492f, 3.476f, 14.94f, 3.028f, 15.492f, 3.028f),
                    PathNode.MoveTo(18.492f, 7.028f),
                    PathNode.CurveTo(19.59657f, 7.028f, 20.492f, 7.923431f, 20.492f, 9.028f),
                    PathNode.LineTo(20.492f, 15.028f),
                    PathNode.CurveTo(20.492f, 16.13257f, 19.59657f, 17.028f, 18.492f, 17.028f),
                    PathNode.LineTo(4.492f, 17.028f),
                    PathNode.CurveTo(3.387431f, 17.028f, 2.492f, 16.13257f, 2.492f, 15.028f),
                    PathNode.LineTo(2.492f, 9.028f),
                    PathNode.CurveTo(2.492f, 7.923431f, 3.387431f, 7.028f, 4.492f, 7.028f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _section!!
    }

private var _section: ImageVector? = null
