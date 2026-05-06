package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Reader: ImageVector
    get() {
        if (_reader != null) return _reader!!
        _reader = radixIcon(
            name = "Reader",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M10.8 1c.318 0 .592-.001 .814 .021 .23 .022 .458 .07 .67 .2l.145 .102c.139 .109 .258 .242 .351 .394l.083 .162c.069 .164 .101 .335 .117 .508 .021 .223 .021 .497 .021 .814v8.6c0 .318 .001 .592-.021 .814-.016 .173-.048 .344-.117 .508l-.083 .162c-.093 .151-.212 .284-.351 .394l-.145 .102c-.212 .13-.44 .178-.67 .2-.223 .021-.497 .021-.814 .021h-6.6c-.318 0-.592 .001-.814-.021-.173-.016-.344-.048-.508-.117l-.162-.083c-.151-.093-.284-.212-.394-.351l-.102-.145c-.13-.212-.178-.44-.2-.67C1.999 12.391 2 12.118 2 11.8v-8.6c0-.318-.001-.592 .021-.814 .022-.23 .07-.458 .2-.67l.102-.145c.109-.139 .242-.258 .394-.351l.162-.083c.164-.069 .335-.101 .508-.117C3.609 .999 3.883 1 4.2 1h6.6ZM4.2 2c-.337 0-.555 .001-.72 .017-.078 .007-.132 .017-.169 .027l-.073 .029c-.034 .021-.064 .046-.092 .073l-.073 .092c-.017 .028-.042 .085-.057 .242C3.001 2.645 3 2.863 3 3.2v8.6c0 .337 .001 .555 .017 .72 .015 .157 .039 .214 .057 .242l.073 .092c.028 .028 .058 .053 .092 .073l.073 .029c.037 .01 .091 .02 .169 .027 .165 .016 .383 .017 .72 .017h6.6c.337 0 .555-.001 .72-.017 .157-.015 .214-.039 .242-.057l.092-.073c.028-.028 .053-.058 .073-.092l.029-.073c.01-.037 .02-.091 .027-.169 .016-.165 .017-.383 .017-.72v-8.6c0-.337-.001-.555-.017-.72-.008-.078-.017-.132-.027-.169l-.029-.073c-.021-.034-.046-.064-.073-.092l-.092-.073c-.028-.017-.085-.042-.242-.057C11.355 2.001 11.137 2 10.8 2h-6.6ZM8 10c.276 0 .5 .224 .5 .5C8.5 10.776 8.276 11 8 11h-3c-.276 0-.5-.224-.5-.5C4.5 10.224 4.724 10 5 10h3ZM10 7c.276 0 .5 .224 .5 .5C10.5 7.776 10.276 8 10 8h-5C4.724 8 4.5 7.776 4.5 7.5 4.5 7.224 4.724 7 5 7h5ZM10.101 4.01c.228 .047 .399 .249 .399 .49 0 .242-.171 .444-.399 .49L10 5h-5C4.724 5 4.5 4.776 4.5 4.5 4.5 4.224 4.724 4 5 4h5l.101 .01Z"),
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
        return _reader!!
    }

private var _reader: ImageVector? = null
