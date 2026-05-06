package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BrandTwitter: ImageVector
    get() {
        if (_brandTwitter != null) return _brandTwitter!!
        _brandTwitter = tablerFilledIcon(
            name = "BrandTwitter",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M14.058 3.41c-1.807 .767-2.995 2.453-3.056 4.38L11 7.972l-.243-.023C8.365 7.68 6.259 6.437 4.813 4.418 4.614 4.14 4.287 3.983 3.945 4.001c-.341 .019-.65 .21-.817 .509l-.097 .186-.049 .099C2.263 6.28 1.792 8.085 1.965 9.998l.03 .273c.283 2.263 1.5 4.215 3.779 5.679l.173 .107-.081 .043C4.551 16.763 3.348 17.052 2.039 17 .983 16.96 .593 18.372 1.521 18.878c3.598 1.961 7.461 2.566 10.792 1.6 4.06-1.18 7.152-4.223 8.335-8.433l.127-.495c.238-.993 .372-2.006 .401-3.024l.003-.332 .393-.779 .44-.862 .214-.434 .118-.247c.265-.565 .456-1.033 .574-1.43l.014-.056 .008-.018c.22-.593-.166-1.358-.941-1.358l-.122 .007c-.079 .01-.157 .029-.231 .057l-.086 .038c-.285 .139-.579 .259-.88 .36l-.356 .115-.271 .08-.772 .214C17.945 2.763 16.137 2.627 14.269 3.327l-.211 .084Z"),
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
        return _brandTwitter!!
    }

private var _brandTwitter: ImageVector? = null
