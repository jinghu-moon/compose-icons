package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Clubs: ImageVector
    get() {
        if (_clubs != null) return _clubs!!
        _clubs = tablerFilledIcon(
            name = "Clubs",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 2.0f),
                    PathNode.CurveTo(10.093025f, 2.000197f, 8.352213f, 3.085102f, 7.512f, 4.797f),
                    PathNode.LineTo(7.409f, 5.022f),
                    PathNode.CurveTo(7.024036f, 5.915035f, 6.907961f, 6.900978f, 7.075f, 7.859f),
                    PathNode.LineTo(7.102f, 7.999f),
                    PathNode.CurveTo(4.927965f, 7.953552f, 2.973817f, 9.318438f, 2.268121f, 11.375253f),
                    PathNode.CurveTo(1.562425f, 13.432068f, 2.267003f, 15.709167f, 4.011f, 17.008f),
                    PathNode.LineTo(4.209f, 17.148f),
                    PathNode.CurveTo(5.509743f, 18.024075f, 7.146267f, 18.238823f, 8.629f, 17.728f),
                    PathNode.LineTo(8.803f, 17.662f),
                    PathNode.LineTo(8.03f, 20.757f),
                    PathNode.CurveTo(7.955153f, 21.055782f, 8.022171f, 21.372387f, 8.211665f, 21.615213f),
                    PathNode.CurveTo(8.40116f, 21.85804f, 8.691985f, 21.999992f, 9.0f, 22.0f),
                    PathNode.LineTo(15.0f, 22.0f),
                    PathNode.LineTo(15.113f, 21.994f),
                    PathNode.CurveTo(15.399442f, 21.961445f, 15.657899f, 21.806854f, 15.822074f, 21.569883f),
                    PathNode.CurveTo(15.986249f, 21.332912f, 16.040169f, 21.036617f, 15.97f, 20.757f),
                    PathNode.LineTo(15.196f, 17.662f),
                    PathNode.LineTo(15.37f, 17.727f),
                    PathNode.CurveTo(17.258572f, 18.376768f, 19.352661f, 17.840311f, 20.696213f, 16.362553f),
                    PathNode.CurveTo(22.039762f, 14.884792f, 22.375013f, 12.749235f, 21.548908f, 10.93087f),
                    PathNode.CurveTo(20.722803f, 9.112506f, 18.893826f, 7.960185f, 16.897f, 8.0f),
                    PathNode.LineTo(16.925f, 7.86f),
                    PathNode.CurveTo(17.180046f, 6.405411f, 16.778624f, 4.912503f, 15.828477f, 3.781973f),
                    PathNode.CurveTo(14.87833f, 2.651443f, 13.476779f, 1.999088f, 12.0f, 2.0f),
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
        return _clubs!!
    }

private var _clubs: ImageVector? = null
