package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PawPrint: ImageVector
    get() {
        if (_pawPrint != null) return _pawPrint!!
        _pawPrint = phosphorLightIcon(
            name = "PawPrint",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M212 82c-14.359 0-26 11.641-26 26 0 14.359 11.641 26 26 26 14.359 0 26-11.641 26-26C238 93.641 226.359 82 212 82ZM212 122c-7.732 0-14-6.268-14-14 0-7.732 6.268-14 14-14 7.732 0 14 6.268 14 14 0 7.732-6.268 14-14 14ZM70 108C70 93.641 58.359 82 44 82 29.641 82 18 93.641 18 108c0 14.359 11.641 26 26 26 14.359 0 26-11.641 26-26ZM44 122c-7.732 0-14-6.268-14-14 0-7.732 6.268-14 14-14 7.732 0 14 6.268 14 14 0 7.732-6.268 14-14 14ZM92 86c14.359 0 26-11.641 26-26C118 45.641 106.359 34 92 34 77.641 34 66 45.641 66 60c0 14.359 11.641 26 26 26ZM92 46c7.732 0 14 6.268 14 14 0 7.732-6.268 14-14 14C84.268 74 78 67.732 78 60 78 52.268 84.268 46 92 46ZM164 86c14.359 0 26-11.641 26-26C190 45.641 178.359 34 164 34c-14.359 0-26 11.641-26 26 0 14.359 11.641 26 26 26ZM164 46c7.732 0 14 6.268 14 14 0 7.732-6.268 14-14 14-7.732 0-14-6.268-14-14 0-7.732 6.268-14 14-14ZM186.15 150.61c-8.667-4.785-15.077-12.818-17.82-22.33C163.115 110.343 146.68 98.006 128 98.006c-18.68 0-35.115 12.337-40.33 30.274-2.732 9.495-9.124 17.517-17.77 22.3-15.3 8.28-23.023 25.892-18.749 42.755C55.424 210.199 70.604 222.006 88 222c5.072 .006 10.093-1.014 14.76-3 16.144-6.655 34.266-6.655 50.41 0 4.689 1.993 9.735 3.014 14.83 3 17.384 .004 32.554-11.789 36.837-28.637 4.283-16.848-3.412-34.454-18.687-42.753ZM168 210c-3.509 .005-6.982-.703-10.21-2.08-19.101-7.887-40.549-7.887-59.65 0-12.766 5.319-27.461-.285-33.443-12.754C58.716 182.697 63.542 167.727 75.68 161.1c11.435-6.321 19.891-16.925 23.51-29.48 3.722-12.817 15.463-21.634 28.81-21.634 13.347 0 25.088 8.817 28.81 21.634 3.627 12.573 12.108 23.187 23.57 29.5 10.483 5.658 15.78 17.716 12.855 29.264C190.31 201.931 179.912 210.014 168 210Z"),
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
        return _pawPrint!!
    }

private var _pawPrint: ImageVector? = null
