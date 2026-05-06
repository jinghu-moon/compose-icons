package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Vault: ImageVector
    get() {
        if (_vault != null) return _vault!!
        _vault = phosphorLightIcon(
            name = "Vault",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 42h-176C32.268 42 26 48.268 26 56v136c0 7.732 6.268 14 14 14h18v18c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-18h116v18c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-18h18c7.732 0 14-6.268 14-14v-136c0-7.732-6.268-14-14-14ZM216 194h-176c-1.105 0-2-.895-2-2v-136c0-1.105 .895-2 2-2h176c1.105 0 2 .895 2 2v66h-20.4C194.439 97.969 173.173 80.514 148.987 82.098 124.8 83.682 105.993 103.762 105.993 128c0 24.238 18.807 44.318 42.994 45.902 24.186 1.584 45.452-15.871 48.613-39.902h20.4v58c0 1.105-.895 2-2 2ZM164.63 122c-2.806-5.915-9.337-9.096-15.724-7.658-6.387 1.438-10.925 7.111-10.925 13.658 0 6.547 4.538 12.22 10.925 13.658 6.387 1.438 12.918-1.743 15.724-7.658h20.83c-3.108 17.334-18.937 29.426-36.478 27.866C131.441 160.306 117.994 145.61 117.994 128c0-17.61 13.447-32.306 30.988-33.866 17.541-1.56 33.37 10.532 36.478 27.866Z"),
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
        return _vault!!
    }

private var _vault: ImageVector? = null
