package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Dumpling: ImageVector
    get() {
        if (_dumpling != null) return _dumpling!!
        _dumpling = tablerOutlineIcon(
            name = "Dumpling",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(5.532f, 5.532f),
                    PathNode.CurveTo(6.201345f, 4.861335f, 7.189331f, 4.620899f, 8.092f, 4.909f),
                    PathNode.CurveTo(8.3411f, 3.924878f, 9.153898f, 3.184672f, 10.156966f, 3.02846f),
                    PathNode.CurveTo(11.160035f, 2.872248f, 12.159431f, 3.330233f, 12.696f, 4.192f),
                    PathNode.QuadTo(12.842f, 3.952f, 13.052f, 3.742f),
                    PathNode.CurveTo(13.756418f, 3.037392f, 14.808578f, 2.811391f, 15.740208f, 3.164582f),
                    PathNode.CurveTo(16.671837f, 3.517773f, 17.309734f, 4.384492f, 17.37f, 5.379f),
                    PathNode.CurveTo(18.3316f, 4.937977f, 19.466074f, 5.141815f, 20.214f, 5.89f),
                    PathNode.LineTo(20.572f, 6.248f),
                    PathNode.CurveTo(21.956f, 7.633f, 19.872f, 11.961f, 15.917f, 15.917f),
                    PathNode.CurveTo(11.961f, 19.872f, 7.633f, 21.957f, 6.248f, 20.572f),
                    PathNode.LineTo(5.89f, 20.214f),
                    PathNode.LineTo(5.776f, 20.092f),
                    PathNode.CurveTo(5.117708f, 19.34196f, 4.961819f, 18.275028f, 5.378f, 17.368f),
                    PathNode.CurveTo(4.278966f, 17.300606f, 3.349478f, 16.530657f, 3.078717f, 15.463367f),
                    PathNode.CurveTo(2.807957f, 14.396077f, 3.258003f, 13.276153f, 4.192f, 12.693f),
                    PathNode.CurveTo(3.330918f, 12.156063f, 2.873588f, 11.156892f, 3.029986f, 10.154244f),
                    PathNode.CurveTo(3.186384f, 9.151597f, 3.926296f, 8.339178f, 4.91f, 8.09f),
                    PathNode.CurveTo(4.622463f, 7.188115f, 4.862449f, 6.201161f, 5.532f, 5.532f)
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
        return _dumpling!!
    }

private var _dumpling: ImageVector? = null
