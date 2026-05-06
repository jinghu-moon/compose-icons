package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ColorFilterLine: ImageVector
    get() {
        if (_colorFilterLine != null) return _colorFilterLine!!
        _colorFilterLine = remixIcon(
            name = "ColorFilterLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 3c2.209 0 4 1.791 4 4 0 .544-.108 1.062-.304 1.533-1.641 .176-3.192 1.025-4.215 2.433C10.221 10.803 9.145 10.054 8.534 8.999 8.195 8.411 8 7.73 8 7 8 4.791 9.791 3 12 3ZM17.764 8.672C17.917 8.141 18 7.58 18 7 18 3.686 15.314 1 12 1 8.686 1 6 3.686 6 7c0 .58 .082 1.141 .236 1.673-.537 .132-1.064 .342-1.567 .631C1.8 10.961 .817 14.63 2.474 17.5c1.657 2.87 5.326 3.853 8.196 2.196 .502-.29 .947-.642 1.33-1.041 .383 .399 .828 .751 1.33 1.041 2.87 1.657 6.539 .674 8.196-2.196 1.657-2.87 .674-6.539-2.196-8.196-.502-.29-1.029-.499-1.566-.631ZM13.154 16.934c.668-1.509 .708-3.277 .001-4.868 .771-1.009 1.958-1.567 3.177-1.568 .678-0 1.366 .172 1.998 .537 1.913 1.105 2.569 3.551 1.464 5.464-1.105 1.913-3.551 2.569-5.464 1.464-.471-.272-.865-.625-1.176-1.03ZM11.365 12.967c.488 1.172 .378 2.479-.231 3.536-.339 .588-.832 1.097-1.464 1.462C7.757 19.069 5.31 18.413 4.206 16.5 3.101 14.587 3.757 12.141 5.67 11.036c.471-.272 .974-.437 1.48-.503 .973 1.333 2.484 2.252 4.215 2.434Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _colorFilterLine!!
    }

private var _colorFilterLine: ImageVector? = null
